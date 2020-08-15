
package bw.randiyadahara.wsims.controler.payment.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.payment.InvoicePayment;
import bw.randiyadahara.wsims.model.payment.Payments;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


 //############################## @author RATHNAYAKA ################ 
 
public class PaymentControler {
    
     public  static String getPaymentNumber() throws ClassNotFoundException, SQLException{
    
      String PENO; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select pno FROM payment where payment_id=(select max(payment_id)from payment)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            PENO= rst.getString(1);
            TxtPart =PENO.substring(0,4);
            numberPart =Integer.parseInt(PENO.trim().substring(4));
            numberPart++;
            
            PENO=TxtPart+numberPart;
            
         } else{
         
         PENO ="CPNO1";
         }
    
     return  PENO;
     
    }
   
       public  static Payments getCustomerInfo(String cusNo) throws ClassNotFoundException, SQLException{
    
      
        
       String Quary ="SELECT iwlname ,cus_no,groupno FROM customers WHERE isactive = 'Y' and deleteyes ='N' and cus_no ='"+cusNo+"'";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);   
        
        Payments p =new Payments();
        
        if(rst.next()){
         
          p.setCustomerName(rst.getString(1));
          p.setDeleteYes(rst.getString(2));
          p.setCusNo(rst.getString(3)); 
            
        }
    
     return p;
     
    }
public static boolean createPayment(Payments p,ArrayList<InvoicePayment> is,String invNo) throws ClassNotFoundException, SQLException{
  
  
  
   String Quary ="INSERT INTO  payment (paydate,amount,createby,discription,isactive,createddate,pno,deleteyes,cusno,remain,invoicescost,rs,change) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        try{
        connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);
        
                pst.setObject(1,p.getPaymentDate());
                pst.setObject(2,p.getPayment());
                pst.setObject(3,p.getCreatedBY());
                pst.setObject(4,p.getDescription());
                pst.setObject(5,p.getIsActive());
                pst.setObject(6,p.getCreatedDate());
                pst.setObject(7,p.getVoucherNo());
                pst.setObject(8,p.getDeleteYes());
                pst.setObject(9,p.getCusNo());
                pst.setObject(10,p.getRemain());
                pst.setObject(11,p.getResiveForPay());
                pst.setObject(12,p.getRs());
                pst.setObject(13,p.getChange());



        int result =pst.executeUpdate();
        
        if(result>0){
                
                boolean rst = InvoicePaymentControler.addPaymentInvoice(is);
                
                if(rst){
                   
                    String cuNo =p.getCusNo(); float ob =p.getRemain();
                   
                   boolean op = InvoicePaymentControler.setCustomerOpenBalance(cuNo,ob);
                   
                        if(op){
                                connection.setAutoCommit(true);
                                 return true;
                        }else{
                                 connection.rollback();
                                 return false;
                        }
                    
                }else{

                    connection.rollback();
                    return false;
                }
            
        
                }else{

                        return false;
                }

                }finally{

                        connection.setAutoCommit(true);

               }
  
  }
  
 public  static String getInvoiceIsPaid(String InvNo) throws ClassNotFoundException, SQLException{
    
     
        
       String Quary ="SELECT ispaid FROM invoicepayment  WHERE docno ='"+InvNo+"' and deleteyes ='N'";
       
       String isPaid ;
       
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
         isPaid=rst.getString(1);
           
         } else{
         
            isPaid="N";
       
         }
    
     return  isPaid;
     
    }

public  static ArrayList<Payments> loadAllPayments() throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT p.pno,p.isactive,c.cus_no,c.iwlname,p.paydate,p.rs,p.amount,p.change,p.remain,p.discription,p.invoicescost FROM payment p INNER JOIN customers c ON c.cus_no =p.cusno WHERE p.deleteyes ='N'";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<Payments> allPayment = new ArrayList<>();
          
           while (rst.next()){
           
           Payments p = new Payments();
           
                p.setVoucherNo(rst.getString(1));
                p.setIsActive(rst.getString(2));
                p.setCusNo(rst.getString(3));
                p.setCustomerName(rst.getString(4));
                p.setPaymentDate(rst.getDate(5));
                p.setRs(rst.getFloat(6));
                p.setPayment(rst.getFloat(7));
                p.setChange(rst.getFloat(8));
                p.setRemain(rst.getFloat(9));
                p.setDescription(rst.getString(10));
                p.setTotalInvoiceCOst(rst.getFloat(11));
               
                allPayment.add(p);
           
           
           }
     return allPayment;
        
    }

public static boolean updatePaymentRecord(Payments p,ArrayList<InvoicePayment> is,String invNo) throws ClassNotFoundException, SQLException{
  
  
  
   String Quary ="UPDATE payment set paydate = ? , amount = ? , discription = ? , isactive= ? , remain =? , updatedby =? , updateddate =? , invoicescost=? , rs =? , change = ?  WHERE pno = ? ";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        try{
        connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);
        
                pst.setObject(1,p.getPaymentDate());
                pst.setObject(2,p.getPayment());
                pst.setObject(3,p.getDescription());
                pst.setObject(4,p.getIsActive());
                pst.setObject(5,p.getRemain());
                pst.setObject(6,p.getUpdateBy());
                pst.setObject(7,p.getUpdateDate());
                pst.setObject(8,p.getResiveForPay());
                pst.setObject(9,p.getRs());
                pst.setObject(10,p.getChange());
                pst.setObject(11,p.getVoucherNo());
            

        int result =pst.executeUpdate();
        
        if(result>0){
                
                boolean rst = InvoicePaymentControler.updatePaymentInvoice(is);
                
                if(rst){
                   
                    String cuNo =p.getCusNo(); float ob =p.getRemain();
                   
                   boolean op = InvoicePaymentControler.setCustomerOpenBalance(cuNo,ob);
                   
                        if(op){
                                connection.setAutoCommit(true);
                                 return true;
                        }else{
                                 connection.rollback();
                                 return false;
                        }
                    
                }else{

                    connection.rollback();
                    return false;
                }
            
        
                }else{

                        return false;
                }

                }finally{

                        connection.setAutoCommit(true);

               }
  
  }

}

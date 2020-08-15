
package bw.randiyadahara.wsims.controler.payment.controler;

import bw.randiyadahara.wsims.model.payment.InvoicePayment;
import bw.randiyadahara.wsims.dbConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


 //################ @ author RATHNAYAKA @ #######################

public class InvoicePaymentControler {
    
  public  static String getPaymentLineNumber() throws ClassNotFoundException, SQLException{
    
      String PENO; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select plno FROM invoicepayment where invoicepayment_id=(select max(invoicepayment_id)from invoicepayment)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            PENO= rst.getString(1);
            TxtPart =PENO.substring(0,4);
            numberPart =Integer.parseInt(PENO.substring(4));
            numberPart++;
            
            PENO=TxtPart+numberPart;
            
         } else{
         
         PENO ="PLNO1";
         }
    
     return  PENO;
     
    }
  
  public static InvoicePayment getPaymentControlInfromation (String groupNo) throws SQLException, ClassNotFoundException{
  
  String Quary ="SELECT latechagerate , paymentduedate  FROM fixcost  WHERE deleteyes ='N' AND  fcno ='"+groupNo+"'";
  
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
  
        InvoicePayment ip = new InvoicePayment();
            if(rst.next()){
               
              ip.setLateChageRate(rst.getFloat(1)); //late Charge For Day
              ip.setDueDate(rst.getInt(1));
            }
            
            
 return ip;
  }
  
  public static InvoicePayment getInvoiceInformation (String invNo,String cusNo) throws SQLException, ClassNotFoundException{
  
  String Quary ="SELECT total,Year,Month,invoicedate,date(CURRENT_DATE)- date(invoicedate),duedate,ispaid  FROM invoice WHERE deleteyes ='N' and docno ='"+invNo+"' AND cusno ='"+cusNo+"'";
  
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
  
        InvoicePayment ip = new InvoicePayment();
            if(rst.next()){
               
              ip.setDf1(rst.getFloat(1)); //INVOICE COST OF 
              ip.setYear(rst.getInt(2));
              ip.setMonth(rst.getInt(3));
              ip.setDeleteYes(rst.getString(4));
              ip.setDf2(rst.getFloat(5));
              ip.setDueDate(rst.getInt(6));
              ip.setIsPaid (rst.getString(7));
            }
            
            
 return ip;
  }
public static float getLateChageRate (String cusNo) throws SQLException, ClassNotFoundException{
  
  String Quary ="SELECT f.latechagerate  FROM customers c INNER JOIN customergroup cg on cg.groupno= c.groupno INNER JOIN fixcost f on f.groupno =cg.groupno WHERE f.deleteyes ='N' and c.cus_no ='"+cusNo+"'";
  
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
  
       float rate = 0 ;
            if(rst.next()){
               
            rate=rst.getFloat(1); //LATE PAY COST  
            }
            
            
 return rate;
  }

   public static boolean addPaymentInvoice(InvoicePayment ip) throws ClassNotFoundException, SQLException{
       
       Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO invoicepayment (setofamount,latepayment,discription,pno,docno,totalpayfi,plno,latedate,isPaid) VALUES (?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, ip.getSetOFfAmount());
        stm.setObject(2, ip.getLateChageRate());
        stm.setObject(3, ip.getDescriptin());
        stm.setObject(4, ip.getVoucherNo());
        stm.setObject(5, ip.getInvoiceNo());
        stm.setObject(6, ip.getSetOFfAmount());
        stm.setObject(7, ip.getLineNo());
        stm.setObject(8,ip.getMonth()); //FOR LATE DATES
        stm.setObject(9,ip.getIsPaid());
///  stm.setObject(9,ip.get); // use as INVOICE NUMBER docno
        if( stm.executeUpdate()>0){
        
            boolean   result =  invoiceISPaidSet(ip.getInvoiceNo() );
         
                if(result){
                    return true;
                }else{
                   return false;
                }
            
           }else{
            
            return false;
        }
     
    }
 
 
    public static boolean addPaymentInvoice( ArrayList<InvoicePayment> ip) throws ClassNotFoundException, SQLException{
        
        if(ip==null){
            return true;       
        }else{
        
            for (InvoicePayment i: ip) {
                if(!addPaymentInvoice(i)){
                return false;
                }
            }
            return true;
        }
    }
    
      public static boolean invoiceISPaidSet(String invNO ) throws ClassNotFoundException, SQLException{
      
       Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE invoice SET ispaid ='Y' WHERE docno='"+invNO+"' and deleteyes ='N'");
       
        return stm.executeUpdate()>0;
      }
     public static boolean setCustomerOpenBalance(String cusno,float opBalance) throws ClassNotFoundException, SQLException{
      
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE customers SET openbalance=openbalance+'"+opBalance+"' WHERE cus_no ='"+cusno+"' and deleteyes ='N'");
       
        return stm.executeUpdate()>0;
      }
     
     public  static ArrayList<InvoicePayment> loadAllPaymentsLines(String PaymentNo) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT p.pno,p.cusno,ip.docno,ip.ispaid,ip.plno,i.invoicedate,i.year,i.month,ip.latedate,i.total,ip.latepayment,ip.totalpayfi,ip.discription from payment p INNER JOIN invoicepayment ip ON ip.pno = p.pno INNER JOIN invoice i ON i.docno =ip.docno WHERE p.pno ='"+PaymentNo+"' and ip.deleteyes ='N' and i.deleteyes ='N'";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<InvoicePayment> allIp = new ArrayList<>();
          
           while (rst.next()){
           
           InvoicePayment p = new InvoicePayment();
           
                p.setVoucherNo(rst.getString(1));
                p.setCusNo(rst.getString(2));
               // p.setCusNo(rst.getString(3));
                p.setInvoiceNo(rst.getString(3));
                p.setIsPaid(rst.getString(4));
                p.setLineNo(rst.getString(5));
                p.setDeleteYes(rst.getString(6)); ///INVOICE DATE SET
                p.setYear(rst.getInt(7));
                p.setMonth(rst.getInt(8));
                p.setDf2((int)rst.getFloat(9)); //Late Days
                p.setSetOFfAmount(rst.getFloat(10));
                p.setLateChageRate(rst.getFloat(11));
                p.setTotalcostForInvoice(rst.getFloat(12));
                p.setDescriptin(rst.getString(13));
               // p.setTotalcostForInvoice(rst.getFloat(14));
               // p.setDescriptin(rst.getString(15));
                allIp.add(p);
           
           
           }
     return allIp;
        
    }
     
     public static boolean updatePaymentInvoice(InvoicePayment ip) throws ClassNotFoundException, SQLException{
       
       Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE invoicepayment SET setofamount =? ,latepayment =? ,discription = ?, ispaid=? ,totalpayfi =? ,latedate =? WHERE plno =? and pno =? and deleteyes ='N'");
        stm.setObject(1, ip.getSetOFfAmount());
        stm.setObject(2, ip.getLateChageRate());
        stm.setObject(3, ip.getDescriptin());
        stm.setObject(4,ip.getIsPaid());
        stm.setObject(5, ip.getSetOFfAmount());
        stm.setObject(6,ip.getMonth()); //FOR LATE DATES
        stm.setObject(7, ip.getLineNo());
        stm.setObject(8, ip.getVoucherNo());
       
///  stm.setObject(9,ip.get); // use as INVOICE NUMBER docno
        if( stm.executeUpdate()>0){
        
            boolean   result =  invoiceISPaidSet(ip.getInvoiceNo() );
         
                if(result){
                    return true;
                }else{
                   return false;
                }
            
           }else{
            
            return false;
        }
     
    } 
    public static boolean updatePaymentInvoice( ArrayList<InvoicePayment> ip) throws ClassNotFoundException, SQLException{
        
        if(ip==null){
            return true;       
        }else{
        
            for (InvoicePayment i: ip) {
                if(!updatePaymentInvoice(i)){
                return false;
                }
            }
            return true;
        }
    } 
    
     public static boolean deletePaymentInvoice(String payNo) throws ClassNotFoundException, SQLException{
     
         
     Connection connection=DBConnection.getInstance().getConnection();
     PreparedStatement stm = connection.prepareStatement("UPDATE payment SET deleteyes ='Y' WHERE  pno = '"+payNo+"'");
       
         try {
             
         connection.setAutoCommit(false);
     
       boolean r =   stm.executeUpdate()>0;
     
            if(r){
                boolean result= deletePaymentInvoiceLine(payNo);
                
                if(result){
                
                        connection.setAutoCommit(true);
                        return true;
                }else{
                
                    connection.rollback();
                    return  false;
                }

            }else{
                return false;
            }
           
      
     } finally{
         connection.setAutoCommit(true);
         
         }
     
     }
    
    public static boolean deletePaymentInvoiceLine(String payNo) throws ClassNotFoundException, SQLException {
      
      Connection connection=DBConnection.getInstance().getConnection();
      PreparedStatement stm = connection.prepareStatement("UPDATE invoicepayment SET ispaid='N', deleteyes ='Y' WHERE  pno = '"+payNo+"'");
    
            boolean result = stm.executeUpdate()>0;
   
            return result;
    }
    
    
}
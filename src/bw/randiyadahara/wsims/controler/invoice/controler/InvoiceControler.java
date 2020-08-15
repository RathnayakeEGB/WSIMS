
package bw.randiyadahara.wsims.controler.invoice.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.invoice.InvoiceSearvice;
import bw.randiyadahara.wsims.model.invoice.Invoices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RATHNAYAKA
 */
public class InvoiceControler {
    
    public  static String getInvoiceNo() throws ClassNotFoundException, SQLException{
    
      String INVNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select docno FROM invoice where invoice_id=(select max(invoice_id)from invoice)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            INVNo= rst.getString(1);
            TxtPart =INVNo.substring(0,5);
            numberPart =Integer.parseInt(INVNo.substring(5));
            numberPart++;
            
            INVNo=TxtPart+numberPart;
            
         } else{
         
         INVNo ="INVNO1";
         }
    
     return  INVNo;
     
    }
    
    public static Invoices GetCustomerAndOtherDetails(int month ,int Year , String cusNo) throws ClassNotFoundException, SQLException{
        Invoices Invoices = null;
         String Quary ="SELECT c.openbalance,c.iwlname,c.isactive,c.address, c.groupno,w.qty, cg.name,w.mtstrat,w.mtend ,w.year,w.month,w.meterreaddate,fc.fixcost,fc.paymentduedate,w.wuno    FROM customers c INNER JOIN waterusage w  on w.crno =c.cus_no\n" +
                    "INNER JOIN customergroup cg  on cg.groupno =c.groupno INNER JOIN fixcost fc on cg.groupno =fc.groupno WHERE w.month ='"+month+"' and w.year ='"+Year+"' and w.deleteyes ='N' and c.deleteyes='N' and fc.deleteyes ='N' and c.cus_no ='"+cusNo+"'";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
    
      while (rst.next()){
            
            Invoices i = new Invoices();
            
            i.setOpenBalance(rst.getFloat(1));
            i.setName(rst.getString(2));
            i.setIsActive(rst.getString(3));
            i.setAddress(rst.getString(4));
            i.setCusGroupNo(rst.getString(5));
            i.setConsumpUnites(rst.getFloat(6));
            i.setCusGroupName(rst.getString(7));
            i.setMeterStrat(rst.getInt(8));
            i.setMeterEnd(rst.getInt(9));
            i.setYear(rst.getInt(10));
            i.setMonth(rst.getInt(11));
            i.setMterReadDate(rst.getDate(12));
            i.setFixCost(rst.getFloat(13));
            i.setDueDate(rst.getInt(14));
            i.setWaterUsageNo(rst.getString(15));
            Invoices =i;
            
        }
    
    
    return Invoices;
    }
  public static boolean createInvoice(Invoices i,ArrayList<InvoiceSearvice> is) throws ClassNotFoundException, SQLException{
  
  
  
   String Quary ="INSERT INTO invoice (docno,invoicedate,invoicetype,duedate,billamount,ispaid,discription,isactive,createddate,createby,year,month,opbalance,wuno,cusno,total,deleteyes,serviceyes,fixcost,servicecost) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        try{
        connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);
        
                pst.setObject(1,i.getInvoiceNo());
                pst.setObject(2,i.getInvDate());
                pst.setObject(3,i.getInvType());
                pst.setObject(4,i.getDueDate());
                pst.setObject(5,i.getBillAmount());
                pst.setObject(6,i.getIsPaid());
                pst.setObject(7,i.getDescription());
                pst.setObject(8,i.getIsActive());
                pst.setObject(9,i.getCreatedDate());
                pst.setObject(10,i.getCreatedBy());
                pst.setObject(11,i.getYear());
                pst.setObject(12,i.getMonth());//
                pst.setObject(13,i.getOpenBalance());
                pst.setObject(14,i.getWaterUsageNo());
                pst.setObject(15,i.getCusNo());
                pst.setObject(16,i.getInvAmount());
                pst.setObject(17,i.getDeleteYeas());
                pst.setObject(18,i.getAdditionalSearvic());
                pst.setObject(19,i.getFixCost());
                pst.setObject(20,i.getDf1());



        int result =pst.executeUpdate();
        
        if(result>0){
                
                boolean r = updateOpenBalance(i.getOpenBalance(),i.getCusNo());
            
                boolean rst =InvoiceSearviceControler.addInvoiceSearvice(is);
                
                
                
                if(rst && r){
                    connection.setAutoCommit(true);
                    return true;
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

  public  static Invoices getControlers(int year,int month,String cuNo) throws ClassNotFoundException, SQLException{
  
        Invoices Invoices = null;
        String Quary ="SELECT ispaid,year,month  FROM invoice  WHERE deleteyes ='N' and year='"+year+"' and month='"+month+"' and cusno='"+cuNo+"'";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
        
        while (rst.next()){
            
                Invoices i = new Invoices();

                i.setIsPaid(rst.getString(1));
                i.setYear(rst.getInt(2));
                i.setMonth(rst.getInt(3));

                Invoices =i;
            
        }
    
    
    return Invoices;
 
  }
  public  static ArrayList<Invoices> loadAllinvoices() throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT i.docno,i.isactive,i.ispaid,i.cusno,c.iwlname,cg.name,i.invoicedate,i.year,i.month,w.qty,i.billamount,i.invoicetype,i.duedate,i.servicecost,i.wuno,i.serviceyes,i.fixcost,i.servicecost,i.total,i.discription,c.address,i.opbalance FROM invoice i INNER JOIN customers c ON c.cus_no =i.cusno INNER JOIN customergroup cg ON cg.groupno =c.groupno INNER JOIN waterusage w  ON i.wuno =w.wuno WHERE i.deleteyes ='N' Order By i.month";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<Invoices> allInvoices = new ArrayList<>();
          
           while (rst.next()){
           
           Invoices i = new Invoices();
           
                i.setInvoiceNo(rst.getString(1));
                i.setIsActive(rst.getString(2));
                i.setIsPaid(rst.getString(3));
                i.setCusNo(rst.getString(4));
                i.setName(rst.getString(5));
                i.setCusGroupName(rst.getString(6));
                i.setInvDate(rst.getDate(7));
                i.setYear(rst.getInt(8));
                i.setMonth(rst.getInt(9));
                i.setConsumpUnites(rst.getInt(10));
                i.setBillAmount(rst.getFloat(11));
                i.setInvType(rst.getString(12));
                i.setDueDate(rst.getInt(13));//
                i.setDf1(rst.getFloat(14)); //service cost
                i.setWaterUsageNo(rst.getString(15));
                i.setServiceYeas(rst.getString(16));
                i.setFixCost(rst.getFloat(17));
                i.setDf2(rst.getFloat(18));  //service cost
                i.setTotalPrice(rst.getFloat(19));
                i.setDescription(rst.getString(20));
                i.setAddress(rst.getString(21)); ///
                i.setOpenBalance(rst.getFloat(22));
                allInvoices.add(i);
           
           
           }
     return allInvoices;
        
    }
   
  
  public static boolean updateOpenBalance(float opB,String cn ) throws ClassNotFoundException, SQLException{
  
      String Quary ="UPDATE customers set openbalance ='0' WHERE cus_no =? and deleteYes ='N'";
      
  
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        PreparedStatement pst = connection.prepareStatement(Quary);
      
        
               // pst.setObject(1,opB);
                pst.setObject(1,cn);
                
               return pst.executeUpdate()>0;
  
 
  }
   public static boolean updateInvoice(Invoices i,ArrayList<InvoiceSearvice> is) throws ClassNotFoundException, SQLException{
  
  
  
   String Quary ="UPDATE invoice SET invoicedate =? ,invoicetype=?,billamount =? ,discription =? ,isactive =? ,year =?, month=?, updatedby =? ,updateddate =? ,total =? ,deleteyes =? ,serviceyes =? ,servicecost =?  WHERE docno =? ";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       try{
       connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);
        
               
                pst.setObject(1,i.getInvDate());
                pst.setObject(2,i.getInvType());
                pst.setObject(3,i.getBillAmount());
                pst.setObject(4,i.getDescription());
                pst.setObject(5,i.getIsActive());
                pst.setObject(6,i.getYear());
                pst.setObject(7,i.getMonth());//
                pst.setObject(8,i.getUpdateBY());
                pst.setObject(9,i.getUpdateDate());
                pst.setObject(10,i.getInvAmount());
                pst.setObject(11,i.getDeleteYeas());
                pst.setObject(12,i.getAdditionalSearvic());
                pst.setObject(13,i.getDf1());
                pst.setObject(14,i.getInvoiceNo());


        int result =pst.executeUpdate();
        
        if(result>0){
                //return true;
               // boolean r = updateOpenBalance(i.getOpenBalance(),i.getCusNo());
            
                boolean rst =InvoiceSearviceControler.updateInvoiceSearvice(is);
                
                
                
                if(rst){
                    connection.setAutoCommit(true);
                    return true;
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
  
      public static boolean deleteInvoice(Invoices i) throws ClassNotFoundException, SQLException{
  
  
  
   String Quary ="UPDATE invoice SET deleteyes =?,updatedDate =? ,UpdatedBy =?  WHERE docno =? ";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       try{
       connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);
        
                pst.setObject(1,i.getDeleteYeas());
                pst.setObject(2,i.getUpdateDate());
                pst.setObject(3,i.getUpdateBY());
                pst.setObject(4,i.getInvoiceNo());


        int result =pst.executeUpdate();
        
        if(result>0){
                
                boolean rst =InvoiceSearviceControler.deleteInvoiceSearvice(i);
                
                if(rst){
                    connection.setAutoCommit(true);
                    return true;
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
   public  static  ArrayList<Invoices>  searchinvoice(String invNo) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT i.docno,i.isactive,i.ispaid,i.cusno,c.iwlname,cg.name,i.invoicedate,i.year,i.month,w.qty,i.billamount,i.invoicetype,i.duedate,i.servicecost,i.wuno,i.serviceyes,i.fixcost,i.servicecost,i.total,i.discription,c.address,i.opbalance FROM invoice i INNER JOIN customers c ON c.cus_no =i.cusno INNER JOIN customergroup cg ON cg.groupno =c.groupno INNER JOIN waterusage w  ON i.wuno =w.wuno WHERE i.deleteyes ='N' and i.docno='"+invNo+"' Order By i.month";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
            ArrayList<Invoices> invoice = new ArrayList<>();
          
           while (rst.next()){
           
           Invoices i = new Invoices();
           
                i.setInvoiceNo(rst.getString(1));
                i.setIsActive(rst.getString(2));
                i.setIsPaid(rst.getString(3));
                i.setCusNo(rst.getString(4));
                i.setName(rst.getString(5));
                i.setCusGroupName(rst.getString(6));
                i.setInvDate(rst.getDate(7));
                i.setYear(rst.getInt(8));
                i.setMonth(rst.getInt(9));
                i.setConsumpUnites(rst.getInt(10));
                i.setBillAmount(rst.getFloat(11));
                i.setInvType(rst.getString(12));
                i.setDueDate(rst.getInt(13));//
                i.setDf1(rst.getFloat(14)); //service cost
                i.setWaterUsageNo(rst.getString(15));
                i.setServiceYeas(rst.getString(16));
                i.setFixCost(rst.getFloat(17));
                i.setDf2(rst.getFloat(18));  //service cost
                i.setTotalPrice(rst.getFloat(19));
                i.setDescription(rst.getString(20));
                i.setAddress(rst.getString(21)); ///
                i.setOpenBalance(rst.getFloat(22));
                
                invoice.add(i);
           
           
           }
     return invoice;
        
    } 
}

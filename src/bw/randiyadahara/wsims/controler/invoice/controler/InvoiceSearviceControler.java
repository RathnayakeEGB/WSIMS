/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bw.randiyadahara.wsims.controler.invoice.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.EmployeesGroup;
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
public class InvoiceSearviceControler {
    
        public  static  String getInvoiceSearviceLineNo() throws ClassNotFoundException, SQLException{
    
      String invLineNo; 
      int numberPart;
      String TxtPart;
      String Quary ="select lineno from invoiceservice where invoiceservice_id=(select max(invoiceservice_id )from invoiceservice)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
         
         
        if(rst.next()){
         
            invLineNo= rst.getString("lineno");
            TxtPart =invLineNo.substring(0,4);
            numberPart =Integer.parseInt(invLineNo.substring(4));
            numberPart++;
            
            invLineNo=TxtPart+numberPart;
            
         } else{
         
         invLineNo ="ISNO1";
         }
    
     return  invLineNo;
          
    }
    
    public  static ArrayList<InvoiceSearvice> getsearviceName() throws ClassNotFoundException, SQLException{

        String Quary = "SELECT name FROM service WHERE deleteyes ='N'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<InvoiceSearvice> allSearviceName= new ArrayList<>();
        
          while (rst.next()){
           InvoiceSearvice is = new InvoiceSearvice();
           is.setServiceName(rst.getString(1));
           allSearviceName.add(is);
        }
      return allSearviceName;
          
}    
    
    
 public  static InvoiceSearvice getsearvicePrice(String name) throws ClassNotFoundException, SQLException{

        String Quary = "SELECT sno,rate FROM service WHERE deleteyes='N' and name ='"+name+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        InvoiceSearvice SearvicePrice= new InvoiceSearvice();
        
          while (rst.next()){
           InvoiceSearvice is = new InvoiceSearvice();
           
           is.setServiceNo(rst.getString(1));
           is.setPrice(rst.getFloat(2));
           
           SearvicePrice=is;
           
        }
      return SearvicePrice;
          
}
 
     public static boolean addInvoiceSearvice(InvoiceSearvice is) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO invoiceservice (qty,price,linetotal,discription,isactive,deleteyes,lineno,sno,docno) values (?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, is.getQty());
        stm.setObject(2, is.getPrice());
        stm.setObject(3, is.getLineTotal());
        stm.setObject(4, is.getDescription());
        stm.setObject(5, is.getIsActve());
        stm.setObject(6, is.getDeletedYes());
        stm.setObject(7, is.getInvoiceLineNo());
        stm.setObject(8,is.getServiceNo());
        stm.setObject(9,is.getServiceName()); // use as INVOICE NUMBER docno
        return stm.executeUpdate()>0;
    }
 
 
    public static boolean addInvoiceSearvice( ArrayList<InvoiceSearvice> is) throws ClassNotFoundException, SQLException{
        
        if(is==null){
            return true;       
        }else{
        
            for (InvoiceSearvice i: is) {
                if(!addInvoiceSearvice(i)){
                return false;
                }
            }
            return true;
        }
    }
    
    
    public static ArrayList<InvoiceSearvice> viewInvoiceSearvice(String invoiceNo ) throws ClassNotFoundException, SQLException{
    
     String Quary ="SELECT i.qty ,i.price,i.linetotal,i.discription,i.isactive ,s.name, i.docno,i.lineno FROM invoiceservice i LEFT JOIN service s ON s.sno = i.sno   WHERE i.deleteyes='N' and i.docno ='"+invoiceNo+"'";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<InvoiceSearvice> is = new ArrayList<>();
          
     while (rst.next()){
           
               InvoiceSearvice i = new InvoiceSearvice();

                  i.setQty(rst.getInt(1));
                  i.setPrice(rst.getFloat(2));
                  i.setLineTotal(rst.getFloat(3));
                  i.setDescription(rst.getString(4));
                  i.setIsActve(rst.getString(5));
                  i.setServiceName(rst.getString(6));
                  i.setDeletedYes(rst.getString(7));
                  i.setInvoiceLineNo(rst.getString(8));
                  is.add(i);
                }
    
    
          if(is== null){
              return null;
          }else{
             return is;
          }
        
    }
    
    public static boolean updateInvoiceSearvice(InvoiceSearvice is) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE invoiceservice SET qty  =? ,price =? ,linetotal=? ,discription =?,isactive =? , deleteyes =?  WHERE docno = ? and lineno =?");
        stm.setObject(1, is.getQty());
        stm.setObject(2, is.getPrice());
        stm.setObject(3, is.getLineTotal());
        stm.setObject(4, is.getDescription());
        stm.setObject(5, is.getIsActve());
        stm.setObject(6, is.getDeletedYes());
        stm.setObject(8, is.getInvoiceLineNo());
        stm.setObject(7,is.getServiceName());
        return stm.executeUpdate()>0;
    }
 
 
    public static boolean updateInvoiceSearvice( ArrayList<InvoiceSearvice> is) throws ClassNotFoundException, SQLException{
        
        if(is==null){
            return true;       
        }else{
        
            for (InvoiceSearvice i: is) {
                if(!updateInvoiceSearvice(i)){
                return false;
                }
            }
            return true;
        }
    } 
    
      public static boolean deleteInvoiceSearvice(Invoices is) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE invoiceservice SET deleteyes =? WHERE docno =? ");
       
        if(is.getServiceYeas().trim().equals("N")){
                return true;
        }else{
        
            stm.setObject(1, is.getDeleteYeas());
            stm.setObject(2,is.getInvoiceNo()); //INVOICE NUMBER
            return true;
        }
     
      
  }
    
}

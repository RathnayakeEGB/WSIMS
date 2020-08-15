
package bw.randiyadahara.wsims.controler;

// author RATHNAYAKA

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CustomerControler {
    
 public  static String customerNo() throws ClassNotFoundException, SQLException{
    
      String CRNO; 
      int numberPart;
      String TxtPart;
      String Quary ="select cus_No FROM customers  where cus_id=(select max(cus_id)from customers)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

                CRNO= rst.getString("cus_No");
                TxtPart =CRNO.substring(0,4);
                numberPart =Integer.parseInt(CRNO.substring(4));
                numberPart++;

                CRNO=TxtPart+numberPart;

             } else{

             CRNO="CRNO1";
             }
    
     return  CRNO;
     
    }
    
   public  static ArrayList<Customer> getSubCommitiesNames() throws ClassNotFoundException, SQLException{

        String Quary = "SELECT name FROM subcommitee WHERE deleteyes ='N' and isactive ='Y'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Customer> allSubcomName= new ArrayList<>();
        
          while (rst.next()){
           Customer eg = new Customer();
           eg.setSubCommiteName(rst.getString(1));
           allSubcomName.add(eg);
        }
      return allSubcomName;
          
} 
   
     
   public  static ArrayList<Customer> getCustomerGroup() throws ClassNotFoundException, SQLException{

        String Quary = "SELECT  name FROM customergroup WHERE deleteyes ='N' ";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Customer> allSubcomName= new ArrayList<>();
        
          while (rst.next()){
           Customer eg = new Customer();
           eg.setCustomerGroupName(rst.getString(1));
           allSubcomName.add(eg);
        }
      return allSubcomName;
          
} 
   
   public  static boolean createNewCustomerAccount(Customer c) throws ClassNotFoundException, SQLException{
   
   String Quary ="INSERT INTO  customers (cus_no,fullname,regdate,nic,phone,openbalance,discription,isactive,createddate,createdby,gender,imurl,deleteyes,iwlname,scno,groupNo,address) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
   
        pst.setObject(1,c.getCusNo());
        pst.setObject(2,c.getName());
        pst.setObject(3,c.getRegDate());
        pst.setObject(4,c.getNic());
        //pst.setObject(5,c.getUserimage());
        pst.setObject(5,c.getPhone());
        pst.setObject(6,c.getOpBalance());
        pst.setObject(7,c.getDiscription());
        pst.setObject(8,c.getIsactive());
        pst.setObject(9,c.getCreatedDate());
        pst.setObject(10,c.getCreatedby());
        pst.setObject(11,c.getGender());
        pst.setObject(12,c.getUrl());
        pst.setObject(13,c.getDeleteYes());
        pst.setObject(14,c.getNameWI());
        pst.setObject(15,c.getSubCno());
        pst.setObject(16,c.getGroupNo());
        pst.setObject(17,c.getAddress());
        
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   }
   
    public  static ArrayList<Customer> viewAllCustomers() throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT c.cus_no,c.isactive,c.openbalance ,c.iwlname,c.fullname, CASE c.gender WHEN 'M' THEN 'Male'ELSE 'Female' END, c.address, c.nic,c.regdate,s.name SubGroup,g.name \"Type\" ,c.discription,c.phone FROM customers c LEFT JOIN subcommitee s on s.cno =c.scno LEFT JOIN customergroup g on g.groupno =c.groupno WHERE c.deleteyes= 'N' order by cus_id";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Customer> allCustomer = new ArrayList<>();
        
         while (rst.next()){
            
            Customer c = new Customer();
            
            c.setCusNo(rst.getString(1));
            c.setIsactive(rst.getString(2));
            c.setOpBalance( rst.getFloat(3));
            c.setNameWI(rst.getString(4));
            c.setName(rst.getString(5));
            c.setGender(rst.getString(6));
            c.setAddress(rst.getString(7));
            c.setNic(rst.getString(8));
            c.setRegDate(rst.getDate(9));
            c.setSubCommiteName(rst.getString(10));
            c.setGroupNo(rst.getString(11));
            c.setDiscription(rst.getString(12));
            c.setPhone(rst.getString(13));
            allCustomer.add(c);
            
        }
    
    return allCustomer;
    
    } 
    
    public  static String getImageUrl(String rgNo) throws ClassNotFoundException, SQLException{
    String parth = null;
     
      String Quary ="SELECT imurl FROM customers WHERE deleteyes ='N' and cus_no ='"+rgNo+"'";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

                parth= rst.getString(1);
              
             }else{
                parth =null;
            } 
    
     return  parth;
     
    } 
    
  public  static ArrayList<Customer> searchCustomer(String Cno) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT c.cus_no,c.isactive,c.openbalance ,c.iwlname,c.fullname, CASE c.gender WHEN 'M' THEN 'Male'ELSE 'Female' END, c.address, c.nic,c.regdate,s.name SubGroup,g.name \"Type\" ,c.discription,c.phone FROM customers c LEFT JOIN subcommitee s on s.cno =c.scno LEFT JOIN customergroup g on g.groupno =c.groupno WHERE c.deleteyes= 'N' and cus_no ='"+Cno+"'";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Customer> Customer = new ArrayList<>();
        
         while (rst.next()){
            
            Customer c = new Customer();
            
            c.setCusNo(rst.getString(1));
            c.setIsactive(rst.getString(2));
            c.setOpBalance( rst.getFloat(3));
            c.setNameWI(rst.getString(4));
            c.setName(rst.getString(5));
            c.setGender(rst.getString(6));
            c.setAddress(rst.getString(7));
            c.setNic(rst.getString(8));
            c.setRegDate(rst.getDate(9));
            c.setSubCommiteName(rst.getString(10));
            c.setGroupNo(rst.getString(11));
            c.setDiscription(rst.getString(12));
            c.setPhone(rst.getString(13));
            Customer.add(c);
            
        }
    
    return Customer;
    
    }
  
  public  static boolean updateCustomerAccount(Customer c) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE customers set fullname=?,regdate=?,nic=?,phone=?,discription=?,isactive=?,updateddate=?,updatedby=?,gender=?,imurl=?,deleteyes=?,iwlname=?,scno=?,groupNo=?,address=?  WHERE cus_no=?";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
       // pst.setObject(6,c.getOpBalance());
       //pst.setObject(5,c.getUserimage());
        pst.setObject(1,c.getName());
        pst.setObject(2,c.getRegDate());
        pst.setObject(3,c.getNic());
        pst.setObject(4,c.getPhone());
        pst.setObject(5,c.getDiscription());
        pst.setObject(6,c.getIsactive());
        pst.setObject(7,c.getUpdateDate());
        pst.setObject(8,c.getUpdateBy());
        pst.setObject(9,c.getGender());
        pst.setObject(10,c.getUrl());
        pst.setObject(11,c.getDeleteYes());
        pst.setObject(12,c.getNameWI());
        pst.setObject(13,c.getSubCno());
        pst.setObject(14,c.getGroupNo());
        pst.setObject(15,c.getAddress());
        pst.setObject(16,c.getCusNo());
        
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   }
    public  static boolean RemoveCustomerAccount(Customer c) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE customers set deleteyes=? WHERE cus_no=?";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
       
        pst.setObject(1,c.getDeleteYes());
        pst.setObject(2,c.getCusNo());
        
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   }
}

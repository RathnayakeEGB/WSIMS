
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.CustomersGroups;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CustomerGroupControler {
    
        public  static String getAttendenceID() throws ClassNotFoundException, SQLException{
    
      String gcNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select groupno FROM customergroup where group_id=(select max(group_id)from customergroup)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
    
        if(rst.next()){
         
            gcNo= rst.getString("groupno");
            TxtPart =gcNo.substring(0,3);
            numberPart =Integer.parseInt(gcNo.substring(3));
            numberPart++;
            
            gcNo=TxtPart+numberPart;
            
         } else{
         
         gcNo ="CGO1";
         }
    
     return  gcNo;
     
    }
   
        
       public static  boolean recordNewCustomerGroup(CustomersGroups cg) throws ClassNotFoundException, SQLException{
       
       String Quary ="INSERT INTO customergroup (name,discription,isactive,createddate,deleteYes,groupno,createdby) VALUES(?,?,?,?,?,?,?)";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,cg.getGroupName());
        pst.setObject(2,cg.getDiscription());   
        pst.setObject(3,cg.getIsActive());   
        pst.setObject(4,cg.getCratedDate());
        pst.setObject(5,cg.getDeleteYes());
        pst.setObject(6,cg.getCusGroupNo());
        pst.setObject(7,cg.getCreatedBy());
        
        int result =pst.executeUpdate();
          
       return result>0;
       }
        
   
       
   
    public  static ArrayList<CustomersGroups> viewCustomerGroupAll() throws ClassNotFoundException, SQLException{
    
         String Quary ="Select groupno, name,isactive,discription from customergroup where deleteYes ='N' order by 1 ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<CustomersGroups> allCustomerGroup = new ArrayList<>();
          
           while (rst.next()){
           
           CustomersGroups cg = new CustomersGroups();
           
             cg.setCusGroupNo(rst.getString(1));
             cg.setGroupName(rst.getString(2));
             cg.setIsActive(rst.getString(3));
             cg.setDiscription(rst.getString(4));
             
             allCustomerGroup .add(cg);
           
           }
     return allCustomerGroup ;
        
    }      
    
   
      public static  boolean updateCustomerGroup(CustomersGroups cg) throws ClassNotFoundException, SQLException{
       
       String Quary ="Update customergroup set name=?,discription=?,isactive=?,updateddate=?,deleteYes=?,updatedby=? where groupno= ?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,cg.getGroupName());
        pst.setObject(2,cg.getDiscription());   
        pst.setObject(3,cg.getIsActive());   
        pst.setObject(4,cg.getUpdatedDate());
        pst.setObject(5,cg.getDeleteYes());
        pst.setObject(6,cg.getUpdatedBy());
        pst.setObject(7,cg.getCusGroupNo());
        
        int result =pst.executeUpdate();
          
       return result>0;
       }
   
       public static  boolean DeleteCustomerGroup(String DeleteYes,String groupNo) throws ClassNotFoundException, SQLException{
       
       String Quary ="Update customergroup set deleteYes=? where groupno= ?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,DeleteYes);
        pst.setObject(2,groupNo);   
        
        
        int result =pst.executeUpdate();
          
       return result>0;
       }
       
       public  static ArrayList<CustomersGroups> searchCusGroup(String GroupNo ) throws ClassNotFoundException, SQLException{
    
         String Quary ="Select groupno, name,isactive,discription from customergroup where deleteYes ='N'and groupno='"+GroupNo+"' order by 1 ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<CustomersGroups> CustomerGroup = new ArrayList<>();
          
           while (rst.next()){
           
           CustomersGroups cg = new CustomersGroups();
           
             cg.setCusGroupNo(rst.getString(1));
             cg.setGroupName(rst.getString(2));
             cg.setIsActive(rst.getString(3));
             cg.setDiscription(rst.getString(4));
             
             CustomerGroup .add(cg);
           
           }
     return CustomerGroup ;
        
    } 
       
public static String getCustomerGroupNo(String name) throws ClassNotFoundException, SQLException{


  String Quary ="select groupno FROM customergroup where name ='"+name+"' and deleteYes ='N'" ;
  String groupNo = null;      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
    
        if(rst.next()){
         
        groupNo=   rst.getString(1);
         }


return groupNo;

}
       
       
}

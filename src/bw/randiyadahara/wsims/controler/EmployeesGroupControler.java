
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.EmployeesGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeesGroupControler {
    
    
    
    public  static  String empGroupNo() throws ClassNotFoundException, SQLException{
        
       String empGroup=null;
        
        String getGroupNo ="select jobNo from empgroup where job_id =(select max(job_id) from empgroup )";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
         Statement stm = connection.createStatement();
         ResultSet rst = stm.executeQuery(getGroupNo);
         
         while(rst.next()){
                  
              empGroup =rst.getString("jobNo");
              
             }
         
         
         return empGroup;
    
    }
    
   
    public static String setEmpGroup() throws ClassNotFoundException, SQLException{
    
        String EmpGroupNo =empGroupNo();
        
        int NumberPart ;
        String txtPart ;
        String number;
        
            if(EmpGroupNo==null){

                number="JNO1" ;
                   
            } else{
                
                NumberPart = Integer.parseInt(EmpGroupNo.substring(3));
                txtPart =EmpGroupNo.substring(0,3);
                ++NumberPart;
                number =txtPart+NumberPart;
        
        }
    return number;
    }
    
    public  static ArrayList<EmployeesGroup> viewCustomerGroupAll() throws ClassNotFoundException, SQLException{
    
         String Quary ="Select  jobNo,title,discription,isactive from empgroup where deleteYes ='N' order by job_id ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<EmployeesGroup> allEmployeesGroups = new ArrayList<>();
          
           while (rst.next()){
           
           EmployeesGroup eg = new EmployeesGroup();
           
             eg.setJobNo(rst.getString(1));
             eg.setName(rst.getString(2));
             eg.setDiscription(rst.getString(3));
             eg.setIsactive(rst.getString(4));
             
             allEmployeesGroups.add(eg);
           
           
           }
     return allEmployeesGroups;
        
    }
    
    
 public static boolean createEmployeeGroup(EmployeesGroup eg) throws ClassNotFoundException, SQLException{
     
      String QuaryAddEMPGroup ="insert into empgroup (title,isactive,discription,cratedate,createdby,deleteYes,jobNO) values(?,?,?,?,?,?,?)";
 
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMPGroup);
        
        pst.setObject(1,eg.getTitle());
        pst.setObject(2,eg.getIsactive());
        pst.setObject(3,eg.getDiscription());
        pst.setObject(4,eg.getCreateddate());
        pst.setObject(5,eg.getCreatedBy());
        pst.setObject(6,eg.getDeleteYes());
        pst.setObject(7,eg.getJobNo());
     
        int result =pst.executeUpdate();
        
 return result>0;
 
 }
    
    public static boolean updateEmployeeGroup(EmployeesGroup eg) throws ClassNotFoundException, SQLException {
    
        String Quary ="update empgroup  set title =?,isActive=?,discription =?,updateBy =?,updatedate =? where jobno =? ";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(Quary);
        
        pst.setObject(1,eg.getTitle());
        pst.setObject(2,eg.getIsactive());
        pst.setObject(3,eg.getDiscription());
        pst.setObject(4,eg.getUpdateBy());
        pst.setObject(5,eg.getUpdateddate());
        pst.setObject(6,eg.getJobNo());
        
        int result =pst.executeUpdate();
    
    return result>0;
    
    }
    
  public static boolean deleteEmployeeGroup(EmployeesGroup eg) throws ClassNotFoundException, SQLException  {
  
            String Quary ="update empgroup  set deleteyes ='Y' where jobno=?";
            DBConnection instance = DBConnection.getInstance();
            Connection connection = instance.getConnection();
            
            PreparedStatement pst = connection.prepareStatement(Quary);
            
            pst.setObject(1, eg.getJobNo());
            
         int result= pst.executeUpdate();
         
    return result>0;
  
  }
  
  
   public  static ArrayList<EmployeesGroup> SearchCustomerGroupAll(String jobno) throws ClassNotFoundException, SQLException{
    
        String Quary ="Select  jobNo,title,discription,isactive from empgroup where jobno ='"+jobno+"' and  deleteYes ='N' order by job_id ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<EmployeesGroup> allEmployeesGroups = new ArrayList<>();
          
           while (rst.next()){
           
           EmployeesGroup eg = new EmployeesGroup();
           
             eg.setJobNo(rst.getString(1));
             eg.setName(rst.getString(2));
             eg.setDiscription(rst.getString(3));
             eg.setIsactive(rst.getString(4));
             
             allEmployeesGroups.add(eg);
           
           
           }
     return allEmployeesGroups;
        
    }
  
  
  
}

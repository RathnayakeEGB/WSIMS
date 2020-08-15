
package bw.randiyadahara.wsims.PermisionControler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UesrControler {
   
    public static Users getUserNamePassWord(Users users) throws ClassNotFoundException, SQLException{
    
     String userName =users.getUserName();
     String Quary ="select password from users where deleteYes ='N' and isActive ='Y' and username='"+userName+"' and deleteYes='N'" ;   
        
     DBConnection instance = DBConnection.getInstance();
     Connection connection = instance.getConnection();
     Statement stm = connection.createStatement(); 
     ResultSet rst = stm.executeQuery(Quary);
    
     Users user =new Users();
     
     while (rst.next()){
         
           user.setPwd(rst.getString(1));
          // users.setUser_id(rst.getString(2));
     }
     
     if(users==null){
      user.setPwd(" ");
      return user;
      
     }else{
         
      return user;
     }
    
   
        
    }
    
  public static Users getUserDetails(Users u,String userName) throws ClassNotFoundException, SQLException{
  
      String uName =userName;
      
      String SelectAccessDetails=   "Select user_id, fname,  username,isActive,cusactive,cusgroupactive,empgroupActive,empactive,"
                                            + "servicactive,wateruseactive,empattendenceactive,paymentactive,invoiceActive,reportsactive"
                                             + "  ,aboutactive,pumpinfoactive,pricelistactive,"
                                            + "usermanageactive,subcom ,fixcost,usertype from users  where username='"+uName+"' and isActive ='Y' and deleteYes='N'";
      
      
      
     DBConnection instance = DBConnection.getInstance();
     Connection connection = instance.getConnection();
     Statement stm = connection.createStatement(); 
     ResultSet rst = stm.executeQuery(SelectAccessDetails);
      
        while (rst.next()){
            u.setUser_id(rst.getString(1));
            u.setFname(rst.getString(2));
            u.setUserName(rst.getString(3));
            u.setIsActive(rst.getString(4));
            u.setCustomer(rst.getString(5));
            u.setCusGroup(rst.getString(6));
            u.setEmpGroup(rst.getString(7));
            u.setEmpLoyee(rst.getString(8));
            u.setService(rst.getString(9));
            u.setWaterUsage(rst.getString(10));
            u.setEmpAttendence(rst.getString(11));
            u.setPayment(rst.getString(12));
            u.setInvoice(rst.getString(13));
            u.setReport(rst.getString(14));
            u.setAbout(rst.getString(15));
            u.setPumpInfo(rst.getString(16));
            u.setPriceList(rst.getString(17));
            u.setUserManage(rst.getString(18));
            u.setSubcomity(rst.getString(19));
            u.setFixcost(rst.getString(20));
            u.setFullName(rst.getString(21));// user Full Name Dispaly
                        
          
  
        }
  return  u;
  }
  

  public static String getUserId(String Name) throws ClassNotFoundException, SQLException{
    
    
     String Quary ="select user_id from users where deleteYes ='N' and isActive ='Y' and username='"+Name+"' and deleteYes='N'" ;   
        
     DBConnection instance = DBConnection.getInstance();
     Connection connection = instance.getConnection();
     Statement stm = connection.createStatement(); 
     ResultSet rst = stm.executeQuery(Quary);
    String ID =null;
     
     while (rst.next()){
         
            ID = rst.getString(1);
          
     }
    
    return ID;
        
    }
  
    
}


package bw.randiyadahara.wsims.PermisionControler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.UsersRolsManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;


public class UserRoleManagementControler {
    
    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static  ArrayList<UsersRolsManagement> UserRolesInfo() throws ClassNotFoundException, SQLException{
        
       ArrayList<UserRoleManagementControler> usersliList=new ArrayList<>(); 
       
       String Quary ="Select user_id, fname,  username,disciption,createdby,createddate,isActive,cusactive,cusgroupactive,empgroupActive,empactive,"
                                 + "servicactive,wateruseactive,empattendenceactive,paymentactive,invoiceActive,reportsactive,aboutactive,pumpinfoactive,pricelistactive,"
                                 + "usermanageactive,subcom,fixcost,usertype from users  where deleteYes ='N' order by 1 ";
    
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
        
         ArrayList<UsersRolsManagement> userRole = new ArrayList<>();
    
    
         while (rst.next()){
         UsersRolsManagement urm =new  UsersRolsManagement();   
         
         urm.setUserId(Integer.parseInt(rst.getString(1)));
         urm.setFname(rst.getString(2));
         urm.setUserName(rst.getString(3));
         urm.setDiscription(rst.getString(4));
         urm.setCreatedBy(rst.getString(5));
         urm.setCreateddate(rst.getString(6));
         urm.setIsActive(rst.getString(7));
         urm.setCustomer(rst.getString(8));
         urm.setCusGroup(rst.getString(9));
         urm.setEmpGroup(rst.getString(10));
         urm.setEmpLoyee(rst.getString(11));
         urm.setService(rst.getString(12));
         urm.setWaterUsage(rst.getString(13));
         urm.setEmpAttendence(rst.getString(14));
         urm.setPayment(rst.getString(15));
         urm.setInvoice(rst.getString(16));
         urm.setReport(rst.getString(17));
         urm.setAbout(rst.getString(18));
         urm.setPumpInfo(rst.getString(19));
         urm.setPriceList(rst.getString(20));
         urm.setUserManage(rst.getString(21));
         urm.setSubCommtee(rst.getString(22));
         urm.setFixCost(rst.getString(23));
         urm.setFullName(rst.getString(24));
         
         userRole.add(urm);
    
    }
    
    return  userRole;
    
    }
  
    
    public static boolean UserRemove(UsersRolsManagement urm) throws ClassNotFoundException, SQLException{
    
      //  int userID =urm.getUserId();
        
        String Quray ="Update users set deleteYes ='Y' where user_id =?";
        
        
            
           Connection connection = DBConnection.getInstance().getConnection();
           PreparedStatement pstm = connection.prepareStatement(Quray);
           
           pstm.setObject(1, urm.getUserId());
           
        int affectedRows = pstm.executeUpdate();
        return affectedRows > 0;
        
        
    }
  
    public  static boolean UpdateUserRole(UsersRolsManagement urm) throws ClassNotFoundException, SQLException{
    
    String Quary = "UPDATE users SET disciption=?,isactive=?,cusactive=?,cusgroupactive=?,empgroupactive=?,empactive=?"
                               + ",fname=?,servicactive=?,wateruseactive=?,empattendenceactive=?,paymentactive=?,invoiceactive=?,reportsactive=?,"
                               + "aboutactive=?, pumpinfoActive=?, pricelistactive=?,usermanageactive=? ,subcom=?,fixcost=?,userType =?  WHERE user_id =?";
    
    
                DBConnection instance = DBConnection.getInstance();
                Connection connection = instance.getConnection();

                PreparedStatement pst = connection.prepareStatement(Quary);
               /// pst.setString(1,urm.getUserName());
                pst.setString(1,urm.getDiscription());   
                pst.setString(2,urm.getIsActive());     
                pst.setString(3,urm.getCustomer());       
                pst.setString(4,urm.getCusGroup());        
                pst.setString(5,urm.getEmpGroup());       
                pst.setString(6,urm.getEmpLoyee());  
                pst.setString(7,urm.getFname());  
                pst.setString(8,urm.getService());        
                pst.setString(9,urm.getWaterUsage());       
                pst.setString(10,urm.getEmpAttendence()); 
                pst.setString(11,urm.getPayment());       
                pst.setString(12,urm.getInvoice()); 
                pst.setString(13,urm.getReport()); 
                pst.setString(14,urm.getAbout());       
                pst.setString(15,urm.getPumpInfo()); 
                pst.setString(16,urm.getPriceList()); 
                pst.setString(17,urm.getUserManage());
                pst.setString(18,urm.getSubCommtee()); 
                pst.setString(19,urm.getFixCost());
                pst.setString(20,urm.getFullName()); //record as user type in psql
                pst.setInt(21,urm.getUserId());
                
                int result =pst.executeUpdate();
    
    
    return result>0;
                
    }
    
 public  static boolean CreateUserRole(UsersRolsManagement urm) throws ClassNotFoundException, SQLException{
    
    String Quary = "insert into users"
                                    + "(username,password,disciption,createdby,createddate,isActive,cusactive,cusgroupactive,empgroupActive,empactive,"
                                    + "fname,servicactive,wateruseactive,empattendenceactive,paymentactive,invoiceActive,reportsactive,aboutactive,pumpinfoactive,pricelistactive,"
                                    + "usermanageactive,subcom,fixcost,usertype) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
                DBConnection instance = DBConnection.getInstance();
                Connection connection = instance.getConnection();

                PreparedStatement pst = connection.prepareStatement(Quary);
                pst.setString(1,urm.getUserName());
                pst.setString(2,urm.getPassWord());
                pst.setString(3,urm.getDiscription());  
                pst.setInt(4,Integer.parseInt(urm.getCreatedBy()));
                pst.setTimestamp(5,Timestamp.valueOf( urm.getCreateddate()));  
                pst.setString(6,urm.getIsActive());     
                pst.setString(7,urm.getCustomer());       
                pst.setString(8,urm.getCusGroup());        
                pst.setString(9,urm.getEmpGroup());       
                pst.setString(10,urm.getEmpLoyee());  
                pst.setString(11,urm.getFname());  
                pst.setString(12,urm.getService());        
                pst.setString(13,urm.getWaterUsage());       
                pst.setString(14,urm.getEmpAttendence()); 
                pst.setString(15,urm.getPayment());       
                pst.setString(16,urm.getInvoice()); 
                pst.setString(17,urm.getReport()); 
                pst.setString(18,urm.getAbout());       
                pst.setString(19,urm.getPumpInfo()); 
                pst.setString(20,urm.getPriceList()); 
                pst.setString(21,urm.getUserManage());
                pst.setString(22,urm.getSubCommtee());
                pst.setString(23,urm.getFixCost());
                pst.setString(24,urm.getFullName());
                
                int result =pst.executeUpdate();
    
    
    return result>0;
                
    }    
    
    public static  ArrayList<UsersRolsManagement> UserRolesSearch(int ID) throws ClassNotFoundException, SQLException{
        
       ArrayList<UserRoleManagementControler> usersliList=new ArrayList<>(); 
       
       String Quary ="Select user_id, fname,  username,disciption,createdby,createddate,isActive,cusactive,cusgroupactive,empgroupActive,empactive,"
                                 + "servicactive,wateruseactive,empattendenceactive,paymentactive,invoiceActive,reportsactive,aboutactive,pumpinfoactive,pricelistactive,"
                                 + "usermanageactive,subcom,fixcost,usertype from users  where deleteYes ='N' and user_ID ='"+ID+"' order by 1 ";
    
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
        
         ArrayList<UsersRolsManagement> userRole = new ArrayList<>();
    
    
         while (rst.next()){
         UsersRolsManagement urm =new  UsersRolsManagement();   
         
         urm.setUserId(Integer.parseInt(rst.getString(1)));
         urm.setFname(rst.getString(2));
         urm.setUserName(rst.getString(3));
         urm.setDiscription(rst.getString(4));
         urm.setCreatedBy(rst.getString(5));
         urm.setCreateddate(rst.getString(6));
         urm.setIsActive(rst.getString(7));
         urm.setCustomer(rst.getString(8));
         urm.setCusGroup(rst.getString(9));
         urm.setEmpGroup(rst.getString(10));
         urm.setEmpLoyee(rst.getString(11));
         urm.setService(rst.getString(12));
         urm.setWaterUsage(rst.getString(13));
         urm.setEmpAttendence(rst.getString(14));
         urm.setPayment(rst.getString(15));
         urm.setInvoice(rst.getString(16));
         urm.setReport(rst.getString(17));
         urm.setAbout(rst.getString(18));
         urm.setPumpInfo(rst.getString(19));
         urm.setPriceList(rst.getString(20));
         urm.setUserManage(rst.getString(21));
         urm.setSubCommtee(rst.getString(22));
         urm.setFixCost(rst.getString(23));
         urm.setFullName(rst.getString(24));
         
         userRole.add(urm);
    
    }
    
    return  userRole;
    
    } 
    
    
}


package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.EmployeesAttendence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeeAttendenceControler {
    
    public  static String getAttendenceID() throws ClassNotFoundException, SQLException{
    
      String aNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select A_id FROM attendence where attendence_id=(select max(attendence_id )from attendence)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
    
        if(rst.next()){
         
            aNo= rst.getString("a_id");
            TxtPart =aNo.substring(0,3);
            numberPart =Integer.parseInt(aNo.substring(3));
            numberPart++;
            
            aNo=TxtPart+numberPart;
            
         } else{
         
         aNo ="ANO1";
         }
    
     return  aNo;
     
    }
    
    
    
    
    
    
    
    public  static EmployeesAttendence getEmployeeName(EmployeesAttendence ea) throws ClassNotFoundException, SQLException{
    
        
        String Quary =" SELECT name,isActive FROM employee WHERE emp_no ='"+ea.getEmpNo()+"' and deleteYes ='N'";
        String Fname="";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection =instance.getConnection();
        
          Statement stm = connection.createStatement();
          ResultSet rst = stm.executeQuery(Quary);
        
          
        
         while(rst.next()){
                  
            ea.setfName(rst.getString(1));
            ea.setIsActive(rst.getString(2));
             }
         
         
         return ea;
       
    }
    
 
    public static boolean RecordEmployeeAttendece(EmployeesAttendence ea) throws ClassNotFoundException, SQLException{
    
        String Quary ="INSERT INTO attendence (status,hours,isactive,createddate,emp_no,createby,discription,deleteyes,years,month,Adate,a_id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    
        DBConnection instance = DBConnection.getInstance();
        Connection connection =instance.getConnection();
        
        
        PreparedStatement pst = connection.prepareStatement(Quary);
         pst.setObject(1,ea.getStatus());
         pst.setObject(2,ea.getHours());
         pst.setObject(3,ea.getIsActive());
         pst.setObject(4,ea.getCreatedDate());
         pst.setObject(5,ea.getEmpNo());
         pst.setObject(6,ea.getCreateBy());
         pst.setObject(7,ea.getDiscription());
         pst.setObject(8,ea.getDeleteYes());
         pst.setObject(9,ea.getYear());
         pst.setObject(10,ea.getMonth());
         pst.setObject(11,ea.getDate());
         pst.setObject(12,ea.getaID());
         
         int result =pst.executeUpdate();
    
    
    return result>0;
    }
    
   public static ArrayList<EmployeesAttendence> getAllAttendenceRecord() throws ClassNotFoundException, SQLException{
   
       String Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                    "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N' order By 1";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> allAttendenceRecord = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
           
            
             allAttendenceRecord.add(ea);
            
        }
        
     return allAttendenceRecord;
   
   }
   
   public static boolean updateAttendenceDetails(EmployeesAttendence ea) throws ClassNotFoundException, SQLException{
   
   String Quary = "UPDATE attendence SET status=?,isactive=?,discription=?,updatedby=?,updateddate=?,years=?,month=?,adate=? WHERE emp_no= ? and a_ID=?";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        PreparedStatement pst = connection.prepareStatement(Quary);
   
         pst.setObject(1,ea.getStatus());
         pst.setObject(2,ea.getIsActive());
         pst.setObject(3,ea.getDiscription());
         pst.setObject(4,ea.getUpdatedBy());
         pst.setObject(5,ea.getUpdateddate());
         pst.setObject(6,ea.getYear());
         pst.setObject(7,ea.getMonth());
         pst.setObject(8,ea.getDate());
         pst.setObject(9,ea.getEmpNo());
         pst.setObject(10,ea.getaID());
         
         int result =pst.executeUpdate();
    
    
    return result>0;
   }
   
   public static boolean deleteAttendenceDetails(EmployeesAttendence ea) throws ClassNotFoundException, SQLException{
   
   String Quary ="update attendence set deleteYes =? ,updatedBy =?,updateddate =? where a_id =? and emp_no=?";
   
     Connection connection = DBConnection.getInstance().getConnection();
     Statement stm = connection.createStatement();
        
     PreparedStatement pst = connection.prepareStatement(Quary);
      pst.setObject(1,ea.getDeleteYes());
      pst.setObject(2,ea.getUpdatedBy());
      pst.setObject(3,ea.getUpdateddate());
      pst.setObject(4, ea.getaID());
      pst.setObject(5,ea.getEmpNo());
    
     int result =pst.executeUpdate();
   
    
    return result>0;
   }
   
  public static ArrayList<EmployeesAttendence> SearchAttendence(String empNo) throws ClassNotFoundException, SQLException{
   
         String Quary;
                      Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                        "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N' and attendence.emp_no ='"+empNo+"' order By 1";
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> employeeAttendenceRecords = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
           
            
            employeeAttendenceRecords.add(ea);
            
        }
        
     return employeeAttendenceRecords;
   
   }  
   public static ArrayList<EmployeesAttendence> SearchAttendence(String empNo,int Year) throws ClassNotFoundException, SQLException{
   
         String Quary;
                 Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                    "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N' and attendence.emp_no ='"+empNo+"' and attendence.Years ='"+Year+"' order By 1";
         
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> employeeAttendenceRecords = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
           
            
            employeeAttendenceRecords.add(ea);
            
        }
        
     return employeeAttendenceRecords;
   
   }  
   public static ArrayList<EmployeesAttendence> SearchAttendence(String empNo,int Year,int month) throws ClassNotFoundException, SQLException{
   
         String Quary;
                 Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                    "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N'  and attendence.emp_no ='"+empNo+"' and attendence.Years ='"+Year+"' and attendence.month ='"+month+"' order By 1";
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> employeeAttendenceRecords = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
           
            
            employeeAttendenceRecords.add(ea);
            
        }
        
     return employeeAttendenceRecords;
   
   }
  
    public static ArrayList<EmployeesAttendence> SearchAttendence(String empNo,java.sql.Date date) throws ClassNotFoundException, SQLException{
   
         String Quary;
         
         if(date ==null){
                Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                    "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N' and attendence.emp_no ='"+empNo+"' order By 1";
       
         }else{
         Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                    "FROM attendence LEFT JOIN employee on employee.emp_no =attendence.emp_no WHERE attendence.deleteyes='N' and attendence.emp_no ='"+empNo+"' and attendence.adate ='"+date+" 'order By 1";
       
         
         } 
                
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> employeeAttendenceRecords = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
            
            employeeAttendenceRecords.add(ea);
            
        }
        
     return employeeAttendenceRecords;
   
   }
    
     public static ArrayList<EmployeesAttendence> SearchAttendence(java.sql.Date date) throws ClassNotFoundException, SQLException{
   
         String Quary;
                      Quary ="SELECT attendence.a_ID, employee.emp_no ,employee.name,employee.isactive,attendence.years,attendence.month,attendence.adate,attendence.status,attendence.discription\n" +
                        "FROM attendence LEFT JOIN employee on employee.emp_no = attendence.emp_no WHERE attendence.deleteyes='N' and attendence.adate ='"+date+"' order By 1";
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesAttendence> employeeAttendenceRecords = new ArrayList<>();
        
        while (rst.next()){
            
            EmployeesAttendence ea = new EmployeesAttendence();
            
            ea.setaID(rst.getString(1));
            ea.setEmpNo(rst.getString(2));
            ea.setfName(rst.getString(3));
            ea.setIsActive(rst.getString(4));
            ea.setYear(rst.getString(5));
            ea.setMonth(rst.getString(6));
            ea.setDate(rst.getDate(7));
            ea.setStatus(rst.getString(8));
            ea.setDiscription(rst.getString(9));
           
            
            employeeAttendenceRecords.add(ea);
            
        }
        
     return employeeAttendenceRecords;
   
   }  
    
    
   
}


package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.EmployeesGroup;
import bw.randiyadahara.wsims.model.Employeses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeeControler {
    
    public static String getJobNo(String titlENo) throws ClassNotFoundException, SQLException{
    
        
        String Quary ="select jobNo from empgroup where title='"+titlENo+"'";       
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
         
         Statement stm = connection.createStatement();
         ResultSet rst = stm.executeQuery(Quary);
         
         if(rst.next()){
         
         titlENo= rst.getString("jobNo");
         } else{
         
        titlENo =null;
         }
   
         return titlENo;    
    }
    public  static  String getEmpNo() throws ClassNotFoundException, SQLException{
    
      String empNo; 
      int numberPart;
      String TxtPart;
      String Quary ="select emp_no from employee where emp_id=(select max(emp_id )from employee)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
         
         
        if(rst.next()){
         
            empNo= rst.getString("Emp_no");
            TxtPart =empNo.substring(0,3);
            numberPart =Integer.parseInt(empNo.substring(3));
            numberPart++;
            
            empNo=TxtPart+numberPart;
            
         } else{
         
         empNo ="EMP1";
         }
    
     return  empNo;
          
    }
    
    
    public static boolean addEmployee(Employeses e) throws SQLException, ClassNotFoundException{
    
     String QuaryAddEMP="insert into employee (emp_no,nic,name,address,gender,tele,isactive,createddate,createdby,discription,jobNo,deleteyes) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMP);
        
        
        pst.setObject(1,e.getEmpNo());
        pst.setObject(2,e.getInc());
        pst.setObject(3,e.getName());
        pst.setObject(4, e.getAddress());
        pst.setObject(5,e.getGender());
        pst.setObject(6,e.getTele());
        pst.setObject(7, e.getIsactive());
        pst.setObject(8,e.getCreatedDate());
        pst.setObject(9,e.getCreatedby());
        pst.setObject(10,e.getDiscription());
        pst.setObject(11, e.getJobno());
        pst.setObject(12, e.getDeleteYes());
        
        int result =pst.executeUpdate();
        
    
    return result>0;
    }
    
    public  static ArrayList<Employeses> viewCustomerAll() throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT e.emp_no,e.name,e.isactive,e.address,"
                + "e.nic,e.tele,e.createddate,e.gender,eg.title,e.discription FROM employee e"
                + " left JOIN empgroup eg on eg.jobno =e.jobno where e.deleteYes='N' ORDER BY 1";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Employeses> allEmployess = new ArrayList<>();
        
         while (rst.next()){
            
            Employeses e = new Employeses();
            
            e.setEmpNo(rst.getString(1));
            e.setName(rst.getString(2));
            e.setIsactive(rst.getString(3));
            e.setAddress(rst.getString(4));
            e.setInc(rst.getString(5));
            e.setTele(rst.getInt(6));
            e.setCreatedDate(rst.getTimestamp(7));
            e.setGender(rst.getString(8));
            e.setDeleteYes(rst.getString(9));
            e.setDiscription(rst.getString(10));
            
             allEmployess.add(e);
            
        }
    
    return allEmployess;
    
    }
    

    
public  static ArrayList<EmployeesGroup> getJobTitle() throws ClassNotFoundException, SQLException{

        String Quary ="select title from empgroup where deleteyes ='N'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<EmployeesGroup> allJobTitle = new ArrayList<>();
        
          while (rst.next()){
            EmployeesGroup eg = new EmployeesGroup();
            eg.setTitle(rst.getString(1));
            allJobTitle.add(eg);
        }
      return allJobTitle;
          
}


public static boolean updateEmployeeDetails(Employeses e) throws ClassNotFoundException, SQLException{

    String Quary ="UPDATE employee SET nic =?,name=?,address =? ,gender =? ,tele =?,isactive =? ,discription =?,jobno =?, deleteyes =? ,updateby =? ,updateddate = ? WHERE emp_no = ?";
    
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(Quary);
    
        
        pst.setObject(1,e.getInc());
        pst.setObject(2,e.getName());
        pst.setObject(3, e.getAddress());
        pst.setObject(4,e.getGender());
        pst.setObject(5,e.getTele());
        pst.setObject(6, e.getIsactive());
        pst.setObject(7,e.getDiscription());
        pst.setObject(8,e.getJobno());
        pst.setObject(9,e.getDeleteYes());
        pst.setObject(10,e.getUpdateBy());
        pst.setObject(11,e.getUpdateDate());
        pst.setObject(12, e.getEmpNo());
        
        
        int result = pst.executeUpdate();
    


return result>0;
}

public  static  boolean  removeEmployee(Employeses e) throws ClassNotFoundException, SQLException{

        String Quary ="update employee set DeleteYes=? where emp_no =?  ";

        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,e.getDeleteYes());
        pst.setObject(2,e.getEmpNo());

       int result = pst.executeUpdate();
 
 return result>0;
} 


  public  static ArrayList<Employeses> SearchCustomerAll(String empNo) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT e.emp_no,e.name,e.isactive,e.address,"
                + "e.nic,e.tele,e.createddate,e.gender,eg.title,e.discription FROM employee e"
                + " left JOIN empgroup eg on eg.jobno =e.jobno where emp_no ='"+empNo+"'and e.deleteYes='N' ORDER BY 1";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<Employeses> searchEmployess = new ArrayList<>();
        
         while (rst.next()){
            
            Employeses e = new Employeses();
            
            e.setEmpNo(rst.getString(1));
            e.setName(rst.getString(2));
            e.setIsactive(rst.getString(3));
            e.setAddress(rst.getString(4));
            e.setInc(rst.getString(5));
            e.setTele(rst.getInt(6));
            e.setCreatedDate(rst.getTimestamp(7));
            e.setGender(rst.getString(8));
            e.setDeleteYes(rst.getString(9));
            e.setDiscription(rst.getString(10));
            
            
            searchEmployess.add(e);
            
        }
    
    return searchEmployess;
    }

}

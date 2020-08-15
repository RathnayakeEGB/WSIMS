
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.Customer;
import bw.randiyadahara.wsims.model.FixCost;
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
public class FixCostControler {
    
      public  static String getFixCostNo() throws ClassNotFoundException, SQLException{
    
      String gcNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select fcno FROM fixcost where f_id=(select max(f_id)from fixcost)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
    
        if(rst.next()){
         
                gcNo= rst.getString("fcno");
                TxtPart =gcNo.substring(0,4);
                numberPart =Integer.parseInt(gcNo.substring(4));
                numberPart++;

                gcNo=TxtPart+numberPart;
            
         } else{
         
              gcNo ="FCNO1";
         }
    
     return  gcNo;
     
    }
      public  static ArrayList<Customer> getCustomerGroupNames() throws ClassNotFoundException, SQLException{

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
        
   public  static boolean createNewRecord(FixCost fc) throws ClassNotFoundException, SQLException{
   
   String Quary ="INSERT INTO fixcost (fcno,name,createby,createdate,groupno,discription,paymentduedate,isactive,lcmonth,latechagerate,fixcost,deleteyes,reConnecPrice)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
   
        pst.setObject(1,fc.getFixCNo());
        pst.setObject(2,fc.getName());
        pst.setObject(3,fc.getCreatedBy());
        pst.setObject(4,fc.getCreatedDate());
        pst.setObject(5,fc.getCusGroupNo());
        pst.setObject(6,fc.getDiscription());
        pst.setObject(7,fc.getDueDate());
        pst.setObject(8,fc.getIsActive());
        pst.setObject(9,fc.getLineCutMonth());
        pst.setObject(10,fc.getLateChageRate());
        pst.setObject(11,fc.getFixCost());
        pst.setObject(12,fc.getDeleteYes());
        pst.setObject(13,fc.getConnctionRenue());
        
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   }       
   public  static ArrayList<FixCost> getAllRecord() throws ClassNotFoundException, SQLException{

        String Quary = "SELECT f.fcno ,f.isactive,f.name,c.name,f.fixcost,f.paymentduedate,f.lcmonth,  f.latechagerate ,f.discription,f.reconnecprice FROM fixcost f INNER JOIN customergroup c on c.groupno= f.groupno WHERE f.deleteyes='N' order by f.f_id";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<FixCost> allRecord= new ArrayList<>();
        
          while (rst.next()){
           FixCost fc = new FixCost();
           fc.setFixCNo(rst.getString(1));
           fc.setIsActive(rst.getString(2));
           fc.setName(rst.getString(3));
           fc.setCusGroupNo(rst.getString(4));
           fc.setFixCost(rst.getFloat(5));
           fc.setDueDate(rst.getInt(6));
           fc.setLineCutMonth(rst.getInt(7));
           fc.setLateChageRate(rst.getFloat(8));
           fc.setDiscription(rst.getString(9));
           fc.setConnctionRenue(rst.getFloat(10));
           allRecord.add(fc);
        }
      return allRecord;
          
} 
       public  static boolean updateNewRecord(FixCost fc) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE fixcost set name =?,updateby=?,updateddate=? ,groupno=?,discription=?,paymentduedate=?, isactive =?, lcmonth=?,latechagerate=?,fixcost =?,deleteyes=?,reconnecprice =? WHERE fcno =?";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
   
        
        pst.setObject(1,fc.getName());
        pst.setObject(2,fc.getUpdatedBy());
        pst.setObject(3,fc.getUpdateDate());
        pst.setObject(4,fc.getCusGroupNo());
        pst.setObject(5,fc.getDiscription());
        pst.setObject(6,fc.getDueDate());
        pst.setObject(7,fc.getIsActive());
        pst.setObject(8,fc.getLineCutMonth());
        pst.setObject(9,fc.getLateChageRate());
        pst.setObject(10,fc.getFixCost());
        pst.setObject(11,fc.getDeleteYes());
        pst.setObject(12,fc.getConnctionRenue());
        pst.setObject(13,fc.getFixCNo());
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   } 
       
  public static String getCusGroupNo(String gno) throws ClassNotFoundException, SQLException{
      
  String Quary ="select groupno FROM fixcost where groupno ='"+gno+"' and deleteYes ='N'" ;
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
  
public  static boolean deleteNewRecord(FixCost fc) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE fixcost SET deleteyes =?, updateby=? ,updateddate=? WHERE fcno=?";
   
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
   
        PreparedStatement pst = connection.prepareStatement(Quary);
   
   
        
        pst.setObject(1,"Y");
        pst.setObject(2,fc.getUpdatedBy());
        pst.setObject(3,fc.getUpdateDate());
        pst.setObject(4,fc.getFixCNo());
        int result =pst.executeUpdate();
        
    
    return result>0;
   
   } 
   public  static ArrayList<FixCost> searchRecord(String No) throws ClassNotFoundException, SQLException{

        String Quary = "SELECT f.fcno ,f.isactive,f.name,c.name,f.fixcost,f.paymentduedate,f.lcmonth,  f.latechagerate ,f.discription,f.reconnecprice FROM fixcost f INNER JOIN customergroup c on c.groupno= f.groupno WHERE f.deleteyes='N' and f.fcno='"+No+"' order by f.f_id";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<FixCost> searchRecord= new ArrayList<>();
        
          while (rst.next()){
           FixCost fc = new FixCost();
           fc.setFixCNo(rst.getString(1));
           fc.setIsActive(rst.getString(2));
           fc.setName(rst.getString(3));
           fc.setCusGroupNo(rst.getString(4));
           fc.setFixCost(rst.getFloat(5));
           fc.setDueDate(rst.getInt(6));
           fc.setLineCutMonth(rst.getInt(7));
           fc.setLateChageRate(rst.getFloat(8));
           fc.setDiscription(rst.getString(9));
           fc.setConnctionRenue(rst.getFloat(10));
           searchRecord.add(fc);
        }
      return searchRecord;
          
}     
}

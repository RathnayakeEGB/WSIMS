
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.SubCommites;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class SubCommiteeControler {
    
      public  static String getSubCommiteeNo() throws ClassNotFoundException, SQLException{
    
      String SGNo; 
      int numberPart;
      String TxtPart;
      String Quary ="select cNo FROM subcommitee  where subcom_id=(select max(subcom_id)from subcommitee)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

                SGNo= rst.getString("cNo");
                TxtPart =SGNo.substring(0,3);
                numberPart =Integer.parseInt(SGNo.substring(3));
                numberPart++;

                SGNo=TxtPart+numberPart;

             } else{

             SGNo ="SGO1";
             }
    
     return  SGNo;
     
    }
    
    
         public static  boolean recordSubCommiteeGroup(SubCommites sc) throws ClassNotFoundException, SQLException{
       
       String Quary ="INSERT INTO subcommitee (name,discription,isActive,CreatedDate,cno,CreatedBy,DeleteYes) VALUES (?,?,?,?,?,?,?)";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,sc.getName());
        pst.setObject(2,sc.getDiscription());   
        pst.setObject(3,sc.getIsActive());   
        pst.setObject(4,sc.getCratedDate());
        pst.setObject(5,sc.getNo());
        pst.setObject(6,sc.getCreatedBy());
        pst.setObject(7,sc.getDeleteYes());
        
        int result =pst.executeUpdate();
          
       return result>0;
       }   
      
     
 public  static ArrayList<SubCommites> viewAllSubCommites() throws ClassNotFoundException, SQLException{
    
         String Quary ="SELECT Cno,name,isactive,discription FROM subcommitee  WHERE deleteYes='N' ORDER BY subcom_id ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<SubCommites> allSubCommites = new ArrayList<>();
          
           while (rst.next()){
           
            SubCommites sc = new SubCommites();
           
             sc.setNo(rst.getString(1));
             sc.setName(rst.getString(2));
             sc.setIsActive(rst.getString(3));
             sc.setDiscription(rst.getString(4));
             
             allSubCommites.add(sc);
           
           }
     return allSubCommites  ;
        
    } 
       public static  boolean updateSubCommitee(SubCommites sc) throws ClassNotFoundException, SQLException{
       
       String Quary ="UPDATE subcommitee SET name =?,discription=?,isactive=?,updatedby=?,updateddate=?,deleteyes=? WHERE cno=?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,sc.getName());
        pst.setObject(2,sc.getDiscription());   
        pst.setObject(3,sc.getIsActive());   
        pst.setObject(4,sc.getUpdatedBy());
        pst.setObject(5,sc.getUpdatedDate());
        pst.setObject(6,sc.getDeleteYes());
        pst.setObject(7,sc.getNo());
        
        int result =pst.executeUpdate();
          
       return result>0;
       }
       
  public static  boolean DeleteSubCommitee(SubCommites sc) throws ClassNotFoundException, SQLException{
       
       String Quary ="UPDATE subcommitee SET deleteyes=? WHERE cno=?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,sc.getDeleteYes());
        pst.setObject(2,sc.getNo());   
        
        
       int result =pst.executeUpdate();
          
       return result>0;
       }      
       
     public  static ArrayList<SubCommites> searchSubCommitee(String No ) throws ClassNotFoundException, SQLException{
    
         String Quary ="SELECT Cno,name,isactive,discription FROM subcommitee  WHERE deleteYes='N' AND cno ='"+No+"' ORDER BY subcom_id ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<SubCommites> subC = new ArrayList<>();
          
           while (rst.next()){
           
           SubCommites sc = new SubCommites();
           
              sc .setNo(rst.getString(1));
              sc .setName(rst.getString(2));
              sc .setIsActive(rst.getString(3));
              sc .setDiscription(rst.getString(4));
             
             subC .add( sc );
           
           }
     return subC ;
        
    }   
     
     public static String getSubComNo(String name) throws ClassNotFoundException, SQLException{
     
      String Quary ="select cNo FROM subcommitee  where name='"+name+"' and deleteYes='N'";
      String subCno = null;
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

               subCno =rst.getString(1);
             }
     
     return  subCno;
     }   
     
}

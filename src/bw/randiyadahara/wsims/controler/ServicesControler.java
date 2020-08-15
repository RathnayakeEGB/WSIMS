
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.Services;
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
public class ServicesControler {
   
public  static String getServiceNo() throws ClassNotFoundException, SQLException{
    
      String gcNo; 
      int numberPart;
      String TxtPart; 
      String Quary ="select sno FROM service where service_id=(select max(service_id)from service)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
        if(rst.next()){
         
            gcNo= rst.getString("sno");
            TxtPart =gcNo.substring(0,3);
            numberPart =Integer.parseInt(gcNo.substring(3));
            numberPart++;
            
            gcNo=TxtPart+numberPart;
            
         } else{
         
         gcNo ="SVO1";
         }
    
     return  gcNo;
     
    }
    
      public static  boolean recordService(Services services ) throws ClassNotFoundException, SQLException{
       
       String Quary ="INSERT INTO service (name,rate,type,discription,isactive,createddate,sno,createdby,deleteyes) VALUES(?,?,?,?,?,?,?,?,?)";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,services.getName());
        pst.setObject(2,services.getRate());   
        pst.setObject(3,services.getType());   
        pst.setObject(4,services.getDiscription());
        pst.setObject(5,services.getIsActive());
        pst.setObject(6,services.getCratedDate());
        pst.setObject(7,services.getServiceNo());
        pst.setObject(8,services.getCreatedBy());
        pst.setObject(9,services.getDeleteYes());
        
        int result =pst.executeUpdate();
          
       return result>0;
       
       }

    public  static ArrayList<Services> viewAllServices() throws ClassNotFoundException, SQLException{
    
         String Quary ="Select sno, name,rate,type, isactive, discription  from service where deleteYes ='N' order by 1 ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<Services> allServices = new ArrayList<>();
          
           while (rst.next()){
           
           Services s = new Services();
           
             s.setServiceNo(rst.getString(1));
             s.setName(rst.getString(2));
             s.setRate(Float.parseFloat( rst.getString(3)));
             s.setType(rst.getString(4));
             s.setIsActive(rst.getString(5));
             s.setDiscription(rst.getString(6));
             
             allServices .add(s);
           
           }
     return allServices ;
        
    }      


     public static  boolean updateSearvice(Services services ) throws ClassNotFoundException, SQLException{
       
       String Quary ="UPDATE service SET name=?,rate=?,type=?,discription=?,isactive=?,UpdatedDate=?,UpdatedBy=?,deleteyes =? where sno =?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,services.getName());
        pst.setObject(2,services.getRate());   
        pst.setObject(3,services.getType());   
        pst.setObject(4,services.getDiscription());
        pst.setObject(5,services.getIsActive());
        pst.setObject(6,services.getUpdatedDate());
        pst.setObject(7,services.getCreatedBy());
        pst.setObject(8,services.getDeleteYes());
         pst.setObject(9,services.getServiceNo());
        
        int result =pst.executeUpdate();
          
       return result>0;
       
       } 
     
      public static  boolean DeleteSearvice(String serviceNo,String DeleteYes ) throws ClassNotFoundException, SQLException{
       
       String Quary ="UPDATE service SET deleteyes =? where sno =?";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,DeleteYes);
        pst.setObject(2,serviceNo);
        
        int result =pst.executeUpdate();
          
       return result>0;
       
       }
      
      
        public  static ArrayList<Services> SearchServices(String sno) throws ClassNotFoundException, SQLException{
    
         String Quary ="Select sno, name,rate,type, isactive, discription  from service where deleteYes ='N' and sno ='"+sno+"' order by 1 ";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<Services> searchServices = new ArrayList<>();
          
           while (rst.next()){
           
           Services s = new Services();
           
             s.setServiceNo(rst.getString(1));
             s.setName(rst.getString(2));
             s.setRate(Float.parseFloat( rst.getString(3)));
             s.setType(rst.getString(4));
             s.setIsActive(rst.getString(5));
             s.setDiscription(rst.getString(6));
             
            searchServices .add(s);
           
           }
     return searchServices ;
        
    }
      
    
}

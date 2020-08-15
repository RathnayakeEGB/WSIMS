
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.EmployeesGroup;
import bw.randiyadahara.wsims.model.WaterConsumption;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RATHNAYAKA
 */
public class WaterConsumptionControler {
    
     public  static String consumptionNo() throws ClassNotFoundException, SQLException{
    
      String CRNO; 
      int numberPart;
      String TxtPart;
      String Quary ="select wuno FROM waterusage  where waterusage_id=(select max(waterusage_id)from waterusage)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

                CRNO= rst.getString("wuno");
                TxtPart =CRNO.substring(0,4);
                numberPart =Integer.parseInt(CRNO.substring(4));
                numberPart++;

                CRNO=TxtPart+numberPart;

             } else{

             CRNO="WUNO1";
             }
    
     return  CRNO;
     
    }
   
     public  static  String GetCustomerName(String cusNo) throws ClassNotFoundException, SQLException{
     
      String Quary ="select iwlname FROM customers  WHERE cus_no ='"+cusNo+"' and deleteYes ='N'  ";
     String name = null;
       DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);  
            if(rst.next()){

              name=rst.getString(1); 
             }else{
            name="No Customer";
            }
     
     return name;
     }
       public  static float StratUnits(String crno) throws ClassNotFoundException, SQLException{
    
      float qty = 0 ; 
      String Value;
      String Quary ="select sum(qty) FROM waterusage where deleteYes ='N' and crno ='"+crno+"'";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(Quary); 
        if(rst.next()){
            Value=rst.getString(1);
            if(Value !=null) {
             qty =Float.parseFloat(Value);
            }else{
            qty =0;
            }
         }  
     return  qty;
     
    }  
       
   public static boolean recordWaterUsage(WaterConsumption wc) throws ClassNotFoundException, SQLException{
     
      String QuaryAddEMPGroup ="INSERT INTO waterusage (meterreaddate,qty,readby,createby,discription,isactive,createddate,wuno,mtstrat,mtend,month,year,deleteyes,crno) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMPGroup);
        
        pst.setObject(1,wc.getmReadDate());
        pst.setObject(2,wc.getComsuptionUnits());
        pst.setObject(3,wc.getReadBy());
        pst.setObject(4,wc.getCreatedBY());
        pst.setObject(5,wc.getDescription());
        pst.setObject(6,wc.getIsactive());
        pst.setObject(7,wc.getCreatedDate());
        pst.setObject(8,wc.getComsuptionNo());
        pst.setObject(9,wc.getStratUnits());
        pst.setObject(10,wc.getEndUnits());
        pst.setObject(11,wc.getMonth());
        pst.setObject(12,wc.getYear());
        pst.setObject(13,wc.getDeleteYes());
        pst.setObject(14,wc.getCusRegNo());
        
   
     
        int result =pst.executeUpdate();
        
 return result>0;
 
 }     
   public  static ArrayList<WaterConsumption> viewConsumptionDetails() throws ClassNotFoundException, SQLException{
    
         String Quary ="SELECT w.wuno,w.crno,c.iwlname,w.isactive,w.year,w.month,w.mtstrat,w.qty,w.mtend, w.discription ,w.readby ,w.meterreaddate FROM waterusage w INNER JOIN customers c ON c.cus_no =w.crno WHERE w.deleteyes ='N'  ORDER BY w.waterusage_id";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<WaterConsumption> allWaterComsuption = new ArrayList<>();
          
           while (rst.next()){
           
           WaterConsumption wc = new WaterConsumption();
           
            wc.setComsuptionNo(rst.getString(1));
            wc.setCusRegNo(rst.getString(2));
            wc.setCustomerName(rst.getString(3));
            wc.setIsactive(rst.getString(4));
            wc.setYear(rst.getInt(5));
            wc.setMonth(rst.getInt(6));
            wc.setStratUnits(rst.getFloat(7));
            wc.setComsuptionUnits(rst.getFloat(8));
            wc.setEndUnits(rst.getFloat(9));
            wc.setDescription(rst.getString(10));
            wc.setReadBy(rst.getString(11));
            wc.setmReadDate(rst.getDate(12));
            
             allWaterComsuption.add(wc);
           
           
           }
     return allWaterComsuption;
        
    }  
   
   public static boolean updateRecord(WaterConsumption wc,float gap,String condition) throws ClassNotFoundException, SQLException {
       if(condition.equals("A")){
           
      DBConnection instance = DBConnection.getInstance();
      Connection connection = instance.getConnection();
      
      String QuaryAddEMPGroup ="UPDATE waterusage SET qty =?, readby =?,discription=? ,isactive =? ,mtstrat =? ,mtend =? ,month =?, year =? ,updatedby=?,updateddate=?,deleteyes=? ,crno=? ,meterreaddate =? WHERE wuno= ? and deleteyes= 'N'";
 
        
         
        
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMPGroup);
        
        pst.setObject(1,wc.getComsuptionUnits());
        pst.setObject(2,wc.getReadBy());
        pst.setObject(3,wc.getDescription());
        pst.setObject(4,wc.getIsactive());
        pst.setObject(5,wc.getStratUnits());
        pst.setObject(6,wc.getEndUnits());
        pst.setObject(7,wc.getMonth());
        pst.setObject(8,wc.getYear());
        pst.setObject(9,wc.getUpdatedBY());
        pst.setObject(10,wc.getUpdatedDate());
        pst.setObject(11,wc.getDeleteYes());
        pst.setObject(12,wc.getCusRegNo());
        pst.setObject(13,wc.getmReadDate());
        pst.setObject(14,wc.getComsuptionNo());  
         
        pst.executeUpdate();
           
           
       
       return true;
       
       }else{
       
       
       
       DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       try{
       connection.setAutoCommit(false); 
      String QuaryAddEMPGroup ="UPDATE waterusage SET qty =?, readby =?,discription=? ,isactive =? ,mtstrat =? ,mtend =? ,month =?, year =? ,updatedby=?,updateddate=?,deleteyes=? ,crno=? ,meterreaddate =? WHERE wuno= ? and deleteyes= 'N'";
 
        
         
        
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMPGroup);
        
        pst.setObject(1,wc.getComsuptionUnits());
        pst.setObject(2,wc.getReadBy());
        pst.setObject(3,wc.getDescription());
        pst.setObject(4,wc.getIsactive());
        pst.setObject(5,wc.getStratUnits());
        pst.setObject(6,wc.getEndUnits());
        pst.setObject(7,wc.getMonth());
        pst.setObject(8,wc.getYear());
        pst.setObject(9,wc.getUpdatedBY());
        pst.setObject(10,wc.getUpdatedDate());
        pst.setObject(11,wc.getDeleteYes());
        pst.setObject(12,wc.getCusRegNo());
        pst.setObject(13,wc.getmReadDate());
        pst.setObject(14,wc.getComsuptionNo());
        
         pst.executeUpdate();
   
     
       if( pst.executeUpdate()>0){
           
           boolean result =ChangeUseQuntity(condition, wc, gap);
           
           if(result){
               
               connection.commit();
                return true; 
           
           }else{
           
                connection.rollback();
                return false;
           }
           
           
       }else{
       
           return false;
       }
       
       }finally{
       connection.setAutoCommit(true);
       
       } 
     
       }
 } 
   
   public  static boolean  ChangeUseQuntity(String condition,WaterConsumption wc ,float gap) throws ClassNotFoundException, SQLException{
  //  java.sql.Date date =returnMaxDate(wc.getCusRegNo());
       
       if(wc.getCusRegNo() == null ? returnMaxCno(wc.getComsuptionNo()) == null : wc.getCusRegNo().equals(returnMaxCno(wc.getComsuptionNo()))){
       
           return true;
           
       }else{
       String Quary;
        switch (condition) {
            case "N":
                Quary ="UPDATE waterusage SET mtstrat =mtstrat -? ,mtend  =mtend -? WHERE deleteyes ='N' AND meterreaddate >?";
                break;
            case "P":
                Quary=" UPDATE waterusage SET mtstrat =mtstrat -? ,mtend  =mtend -? WHERE deleteyes ='N' AND  meterreaddate >? ";
                break;
            default: 
                return  true;
        }
       
            
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,gap);
        pst.setObject(2,gap);
        pst.setObject(3,wc.getmReadDate());
       
        int result =pst.executeUpdate();
        if(result>0){
        return true;
        }else{
        return false;
        }
        
       }
       
       
      //return true;
   }

   
     public static java.sql.Date returnMaxDate(String no) throws ClassNotFoundException, SQLException{
    
      String Quary ="SELECT max(meterreaddate)FROM waterusage WHERE deleteyes ='N' and crno ='"+no+"'";
        java.sql.Date date = null;
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
    
        ResultSet rst = stm.executeQuery(Quary);
        while (rst.next()){
         date= (Date.valueOf(rst.getString(1)));
        }
        
    return date;
    
    }
     
       public static String returnMaxCno(String no) throws ClassNotFoundException, SQLException{
    
      String Quary ="SELECT wuno FROM waterusage WHERE deleteyes ='N' and crno ='"+no+"' and  waterusage_id =(select max( waterusage_id ) FROM waterusage WHERE crno ='"+no+"' and  deleteyes ='N'  )";
        String cno = null;
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
    
        ResultSet rst = stm.executeQuery(Quary);
        while (rst.next()){
         cno= (rst.getString(1));
        }
        
    return cno;
    
    }
     
     
     
     public  static boolean removeRecord(WaterConsumption wc,String no ,float gap) throws ClassNotFoundException, SQLException{
     
         DBConnection instance = DBConnection.getInstance();
         Connection connection = instance.getConnection();
         try {
         
        connection.setAutoCommit(false);
        
        String Quary ="UPDATE waterusage SET deleteyes =? WHERE wuno ='"+no+"' ";
        
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,wc.getDeleteYes());
        
       if(pst.executeUpdate()>0){
                  boolean result =ChangeUseQuntity(no, wc, gap);
              if(result ){
                  connection.commit();
                     return true;
       
                  }else{
                  connection.rollback();
                     return false;
             }
           
       }else{
           return false;
       }
         }finally{
         
         connection.setAutoCommit(true);
         
         }
     
     }
    
      public  static ArrayList<WaterConsumption> searchConsumptionDetails(String wuno,String cusNO) throws ClassNotFoundException, SQLException{
    
         String Quary ="SELECT w.wuno,w.crno,c.iwlname,w.isactive,w.year,w.month,w.mtstrat,w.qty,w.mtend, w.discription ,w.readby ,w.meterreaddate FROM waterusage w INNER JOIN customers c ON c.cus_no =w.crno WHERE w.deleteyes !='Y' and wuno ='"+wuno+"' or crno ='"+cusNO+"' ORDER BY w.waterusage_id";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
          ArrayList<WaterConsumption> allWaterComsuption = new ArrayList<>();
          
           while (rst.next()){
           
           WaterConsumption wc = new WaterConsumption();
           
            wc.setComsuptionNo(rst.getString(1));
            wc.setCusRegNo(rst.getString(2));
            wc.setCustomerName(rst.getString(3));
            wc.setIsactive(rst.getString(4));
            wc.setYear(rst.getInt(5));
            wc.setMonth(rst.getInt(6));
            wc.setStratUnits(rst.getFloat(7));
            wc.setComsuptionUnits(rst.getFloat(8));
            wc.setEndUnits(rst.getFloat(9));
            wc.setDescription(rst.getString(10));
            wc.setReadBy(rst.getString(11));
            wc.setmReadDate(rst.getDate(12));
            
             allWaterComsuption.add(wc);
           
           
           }
     return allWaterComsuption;
        
    }  
     
     
}

package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.PumpedInfo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PumpedInfoControler {
    
    public  static String getPumpedLineNo() throws ClassNotFoundException, SQLException{
    
      String pNo; 
      int numberPart;
      String TxtPart; 
      String Quary ="select pNo FROM waterpumped where waterpumped_id=(select max(waterpumped_id)from waterpumped)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
        if(rst.next()){
         
            pNo= rst.getString("pno");
            TxtPart =pNo.substring(0,3);
            numberPart =Integer.parseInt(pNo.substring(3));
            numberPart++;
            
            pNo=TxtPart+numberPart;
            
         } else{
         
         pNo ="WPN1";
         }
    
     return  pNo;
     
    }
    
    public  static float totalPumpedWaterUinits() throws ClassNotFoundException, SQLException{
    
      float qty = 0 ; 
      String Value;
      String Quary ="select sum(qty) FROM waterpumped where deleteYes ='N'";
        
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
    
      public static  boolean recordPumpedInfo(PumpedInfo pumpedInfo ) throws ClassNotFoundException, SQLException{
       
        String Quary=" INSERT INTO waterpumped(pumpeddate,discription,isactive,createddate,createby,deleteYes,pno,qty,sunit,eunit,year) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDate());
        pst.setObject(2,pumpedInfo.getDiscription());   
        pst.setObject(3,pumpedInfo.getIsActive());
        pst.setObject(4,pumpedInfo.getCratedDate());   
        pst.setObject(5,pumpedInfo.getCreatedBy()); 
        pst.setObject(6,pumpedInfo.getDeleteYes());
        pst.setObject(7,pumpedInfo.getPno());   
        pst.setObject(8,pumpedInfo.getQuntity());  
        pst.setObject(9,pumpedInfo.getStartUnits());   
        pst.setObject(10,pumpedInfo.getEndUnite());
        pst.setObject(11,pumpedInfo.getYear());
                
        int result =pst.executeUpdate();
          
       return result>0;
       
       }
      
      
        public  static ArrayList<PumpedInfo> viewAllPumpedInFro() throws ClassNotFoundException, SQLException{
    
         String Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' order by 3 ASC";
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
           ArrayList<PumpedInfo> allPumpedInfo = new ArrayList<>();
          
           while (rst.next()){
           
           PumpedInfo info = new PumpedInfo();
           
             info.setPno(rst.getString(1));
             info.setYear(Integer.parseInt(rst.getString(2)));
             info.setPumpDate(Date.valueOf(rst.getString(3)));
             info.setStartUnits(Float.parseFloat( rst.getString(4)));
             info.setQuntity(Float.parseFloat( rst.getString(5)));
             info.setEndUnite(Float.parseFloat( rst.getString(6)));
             info.setIsActive(rst.getString(7));
             info.setDiscription(rst.getString(8));
             
             allPumpedInfo .add(info);
           
           }
     return allPumpedInfo;
        
    } 
  
   public static  boolean UpdatePumpedInfo(PumpedInfo pumpedInfo,String Condition ) throws ClassNotFoundException, SQLException{
       
        String Quary ="" ;
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        
        if(Condition.equals("N")){
        Quary =" UPDATE waterpumped set pumpeddate=?,discription=?,isactive=?,updatedBy=?,updatedDate=?,deleteYes=?,qty=?,eunit=?,year=? where pno= ? and deleteYes ='N'"    ;
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDate());
        pst.setObject(2,pumpedInfo.getDiscription());   
        pst.setObject(3,pumpedInfo.getIsActive());
        pst.setObject(4,pumpedInfo.getUpdatedBy());   
        pst.setObject(5,pumpedInfo.getUpdatedDate()); 
        pst.setObject(6,pumpedInfo.getDeleteYes());
        pst.setObject(7,pumpedInfo.getAmount());  
        pst.setObject(8,pumpedInfo.getEndUnite());
        pst.setObject(9,pumpedInfo.getYear());
        pst.setObject(10,pumpedInfo.getPno());
                
        return  pst.executeUpdate()>0;
        
        
        }else if(Condition.equals("P")){
            
   try{
            
          connection.setAutoCommit(false);  
            
        Quary =" UPDATE waterpumped set pumpeddate=?,discription=?,isactive=?,updatedBy=?,updatedDate=?,deleteYes=?,qty=qty-?,eunit=?,year=? where pno= ? and deleteYes ='N'";
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDate());
        pst.setObject(2,pumpedInfo.getDiscription());   
        pst.setObject(3,pumpedInfo.getIsActive());
        pst.setObject(4,pumpedInfo.getUpdatedBy());   
        pst.setObject(5,pumpedInfo.getUpdatedDate()); 
        pst.setObject(6,pumpedInfo.getDeleteYes());
        pst.setObject(7,pumpedInfo.getQuntity());  
        pst.setObject(8,pumpedInfo.getEndUnite());
        pst.setObject(9,pumpedInfo.getYear());
        pst.setObject(10,pumpedInfo.getPno());
                
            if(  pst.executeUpdate()>0){
                boolean result= UpdateStrateUnitsPositive(pumpedInfo);
            
                if(result){
                connection.commit();
                return true;
                }
            }
                connection.rollback();
                return false;
     }finally{
            
                connection.setAutoCommit(true);
            
            }
          
            
        }else{
    
     try{       
         connection.setAutoCommit(false);   
        Quary =" UPDATE waterpumped set pumpeddate=?,discription=?,isactive=?,updatedBy=?,updatedDate=?,deleteYes=? ,qty=qty-?,eunit=?,year=? where pno= ? and deleteYes ='N'";
        PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDate());
        pst.setObject(2,pumpedInfo.getDiscription());   
        pst.setObject(3,pumpedInfo.getIsActive());
        pst.setObject(4,pumpedInfo.getUpdatedBy());   
        pst.setObject(5,pumpedInfo.getUpdatedDate()); 
        pst.setObject(6,pumpedInfo.getDeleteYes());
        pst.setObject(7,pumpedInfo.getQuntity());  
        pst.setObject(8,pumpedInfo.getEndUnite());
        pst.setObject(9,pumpedInfo.getYear());
        pst.setObject(10,pumpedInfo.getPno());
        if(  pst.executeUpdate()>0){

            boolean result= UpdateStrateUnitsNagative(pumpedInfo);
            
                if(result==true){
                    connection.commit();
                    return true;
                  }

                }
         
               connection.rollback();
                return false;
        
         } finally{
            
                connection.setAutoCommit(true);
            }
        }
}
   
   public static boolean UpdateStrateUnitsPositive(PumpedInfo pumpedInfo) throws ClassNotFoundException, SQLException{
   
    if(returnDate()!=pumpedInfo.getDate()){
    String Quary=" UPDATE waterpumped set sunit=sunit+? ,eunit=eunit+? where  pumpedDate>? and deleteYes ='N'";

    DBConnection instance = DBConnection.getInstance();
    Connection connection = instance.getConnection();
    
     PreparedStatement pst = connection.prepareStatement(Quary);
       
        pst.setObject(1,pumpedInfo.getsGap());   
        pst.setObject(2,pumpedInfo.getEgap());
        pst.setObject(3,pumpedInfo.getDate());
    
        return pst.executeUpdate()>0;
    
    }else{
    
    return true;
    
    }
     
   }
  
   public static boolean UpdateStrateUnitsNagative(PumpedInfo pumpedInfo) throws ClassNotFoundException, SQLException{
   
  String Quary=" UPDATE waterpumped set sunit=sunit-? ,eunit=eunit-? where  pumpedDate>? and deleteYes ='N'";

  if(returnDate()!=pumpedInfo.getDate()){
  
    DBConnection instance = DBConnection.getInstance();
    Connection connection = instance.getConnection();
    
     PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getsGap());   
        pst.setObject(2,pumpedInfo.getEgap());
        pst.setObject(3,pumpedInfo.getDate());
    
        return pst.executeUpdate()>0;
  
        }else{

      return true;
      }
  
   }
     
    public static java.sql.Date returnDate() throws ClassNotFoundException, SQLException{
    
      String Quary ="SELECT max( pumpeddate)  FROM waterpumped WHERE deleteYes ='N'";
        java.sql.Date date = null;
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
    
        ResultSet rst = stm.executeQuery(Quary);
        while (rst.next()){
       date= (Date.valueOf(rst.getString(1)));
        }
        
    return date;
    
    }
   
   
}

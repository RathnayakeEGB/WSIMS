
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


public class WaterPumpedSecodControler {
    
 
    public  static boolean deleteWaterPumpedInfo(PumpedInfo pumpedInfo) throws ClassNotFoundException, SQLException{
    
    DBConnection instance = DBConnection.getInstance();
    Connection connection = instance.getConnection();
    if(PumpedInfoControler.returnDate().equals(pumpedInfo.getDate())){
    
     String Quary=" UPDATE waterpumped set deleteYes=?, updatedBy= ?,UpdatedDate=? where pno=?";

  
  
   
    
     PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDeleteYes());   
        pst.setObject(2,pumpedInfo.getUpdatedBy());
        pst.setObject(3,pumpedInfo.getUpdatedDate());
        pst.setObject(4,pumpedInfo.getPno());
    
        return pst.executeUpdate()>0;
      
    }else{
    
     try{
 
    String Quary=" UPDATE waterpumped set deleteYes=? ,updatedBy= ?,UpdatedDate=? where pno=?";
   
    connection.setAutoCommit(false);
  
    
    
     PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getDeleteYes());   
        pst.setObject(2,pumpedInfo.getUpdatedBy());
        pst.setObject(3,pumpedInfo.getUpdatedDate());
        pst.setObject(4,pumpedInfo.getPno());
    
        boolean result= pst.executeUpdate()>0;
        
        if(result){
            
          boolean rsut = chageStartANDendUnits(pumpedInfo);
          
                if(rsut){
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
    
    
public static boolean chageStartANDendUnits(PumpedInfo pumpedInfo) throws ClassNotFoundException, SQLException{


 String Quary=" UPDATE waterpumped set sunit=sunit-?,eunit=eunit-?, updatedBy= ?,UpdatedDate=? where pumpedDate>? and DeleteYes='N'";

    DBConnection instance = DBConnection.getInstance();
    Connection connection = instance.getConnection();
    
     PreparedStatement pst = connection.prepareStatement(Quary);
        pst.setObject(1,pumpedInfo.getQuntity());   
        pst.setObject(2,pumpedInfo.getQuntity());
        pst.setObject(3,pumpedInfo.getUpdatedBy());
        pst.setObject(4,pumpedInfo.getUpdatedDate());
        pst.setObject(5,pumpedInfo.getDate());
    
      boolean result= pst.executeUpdate()>0;

        return result;


}

      public  static ArrayList<PumpedInfo> SearchPumpedInFro(String Pno,int Year,java.sql.Date date ) throws ClassNotFoundException, SQLException{
    
        String Quary ;  
        
        if(Pno !=null &&Year==0 &&date ==null){
         Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' and Pno='"+Pno+"' order by 3 ASC";
        }else if (Pno !=null &&Year !=0 &&date ==null){
        Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' and Year='"+Year+"' order by 3 ASC";
        }else if (Pno==null && Year == 0&& date !=null){
         Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' and pumpedDate='"+date+"' order by 3 ASC";
        }else if(Pno !=null && Year!=0 && date !=null){
         Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' and Pno='"+Pno+"' and pumpedDate='"+date+"' and Year='"+Year+"' order by 3 ASC";
        }else{
             Quary ="SELECT pno,year,pumpeddate ,sunit,qty,eunit,isActive,discription FROM waterpumped WHERE deleteYes ='N' order by 3 ASC";
        }
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
           ArrayList<PumpedInfo> SearchPumpedInfo = new ArrayList<>();
          
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
             
             SearchPumpedInfo .add(info);
           
           }
     return SearchPumpedInfo;
        
    }

 public  static String getMaxRecordDate(java.sql.Date date) throws ClassNotFoundException, SQLException{
    
     
     
      String Quary ="select pumpeddate FROM waterpumped where deleteYes ='N'and pumpeddate ='"+date+"' ";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        
        if(rst.next()){
         
           if(rst==null){
               return "N";
           }else{
               return  "Y";
           } 
            
         } 
     
     return "N";
    }
     
}
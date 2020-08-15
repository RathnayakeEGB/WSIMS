
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.CustomerGroupmatrixPriceList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


 // * @author RATHNAYAKA
 
public class CustomerGroupUsageMatrixPriceListCotroler {
  
 public  static String getLineNo() throws ClassNotFoundException, SQLException{
    
      String gcNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select lineno FROM customergroupmatrixPriceList where customergroupmatrix_id=(select max(customergroupmatrix_id)from customergroupmatrixPriceList)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            gcNo= rst.getString("lineno");
            TxtPart =gcNo.substring(0,3);
            numberPart =Integer.parseInt(gcNo.substring(3));
            numberPart++;
            
            gcNo=TxtPart+numberPart;
            
         } else{
         
         gcNo ="LNO1";
         }
    
     return  gcNo;
     
    }

    public static boolean addPriceList( ArrayList<CustomerGroupmatrixPriceList> PriceListDetails) throws ClassNotFoundException, SQLException{
        for (CustomerGroupmatrixPriceList cgpl: PriceListDetails) {
            if(!addPriceList(cgpl)){
                return false;
            }
        }
        return true;
    }
    public static boolean addPriceList(CustomerGroupmatrixPriceList gpl) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO customergroupmatrixPricelist (isactive,umplno,groupno,fromunite,tounite,rate,name,lineno,deleteyes ) VALUES (?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, gpl.getIsActive());
        stm.setObject(2, gpl.getMextrixPriceListNo());
        stm.setObject(3, gpl.getGroupNo());
        stm.setObject(4, gpl.getFromUnits());
        stm.setObject(5, gpl.getToUnits());
        stm.setObject(6, gpl.getRate());
        stm.setObject(7, gpl.getName());
        stm.setObject(8, gpl.getLineNo());
        stm.setObject(9, gpl.getDeleteYes());
        return stm.executeUpdate()>0;
    }
 
 
   public static boolean updatePriceList( ArrayList<CustomerGroupmatrixPriceList> PriceListDetails) throws ClassNotFoundException, SQLException{
        for (CustomerGroupmatrixPriceList cgpl: PriceListDetails) {
            if(!updatePriceList(cgpl)){
                return false;
            }
        }
        return true;
    }
    public static boolean updatePriceList(CustomerGroupmatrixPriceList gpl) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE customergroupmatrixpricelist SET isActive =? ,fromunite=?,tounite=? ,rate =?,name=? ,deleteyes =? WHERE lineno =? ");
        stm.setObject(1, gpl.getIsActive());
        stm.setObject(2, gpl.getFromUnits());
        stm.setObject(3, gpl.getToUnits());
        stm.setObject(4, gpl.getRate());
        stm.setObject(5, gpl.getName());
        stm.setObject(6, gpl.getDeleteYes());
        stm.setObject(7, gpl.getLineNo());
        
        return stm.executeUpdate()>0;
    }
    
   public  static ArrayList<CustomerGroupmatrixPriceList> GetGroupPriceList(String PriceListNo) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT umplno,isactive,lineno,name,fromunite,tounite,rate FROM customergroupmatrixpricelist WHERE deleteyes='N' and umplno ='"+PriceListNo+"'";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<CustomerGroupmatrixPriceList> al = new ArrayList<>();
        
         while (rst.next()){
            
            CustomerGroupmatrixPriceList cgpl= new CustomerGroupmatrixPriceList();
            
            cgpl.setMextrixPriceListNo(rst.getString(1));
            cgpl.setIsActive(rst.getString(2));
            cgpl.setLineNo(rst.getString(3));
            cgpl.setName(rst.getString(4));
            cgpl.setFromUnits(rst.getInt(5));
            cgpl.setToUnits(rst.getInt(6));
            cgpl.setRate(rst.getFloat(7));
           
            
            al.add(cgpl);
            
        }
    
    return al;
    
    }
    
    public static boolean addPriceListNewLine(CustomerGroupmatrixPriceList gpl) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO customergroupmatrixPricelist (isactive,umplno,groupno,fromunite,tounite,rate,name,lineno,deleteyes ) VALUES (?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, gpl.getIsActive());
        stm.setObject(2, gpl.getMextrixPriceListNo());
        stm.setObject(3, gpl.getGroupNo());
        stm.setObject(4, gpl.getFromUnits());
        stm.setObject(5, gpl.getToUnits());
        stm.setObject(6, gpl.getRate());
        stm.setObject(7, gpl.getName());
        stm.setObject(8, gpl.getLineNo());
        stm.setObject(9, gpl.getDeleteYes());
        return stm.executeUpdate()>0;
    } 
    
    public static String checkLineNo(String lineNo) throws ClassNotFoundException, SQLException{
    
    String Quary ="select lineno FROM customergroupmatrixPriceList where lineno ='"+lineNo+"'";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            lineNo= rst.getString("lineno");  
         } else{
        
            lineNo="NO";
         
         }
    
    return lineNo;
    }
    
    
   public static boolean removePriceListLine(String lineNo) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE customergroupmatrixPriceList SET deleteYes =? WHERE lineno =? ";
       DBConnection instance = DBConnection.getInstance();
       Connection connection = instance.getConnection();
       PreparedStatement pst = connection.prepareStatement(Quary);
         pst.setObject(1,"Y");
         pst.setObject(2,lineNo);
        
       return pst.executeUpdate()>0;
   
   }
   
   public static boolean deletePriceListLine(String listNo) throws ClassNotFoundException, SQLException{
   
   String Quary ="UPDATE customergroupmatrixPriceList SET deleteYes =? WHERE umplno =? ";
       DBConnection instance = DBConnection.getInstance();
       Connection connection = instance.getConnection();
       PreparedStatement pst = connection.prepareStatement(Quary);
         pst.setObject(1,"Y");
         pst.setObject(2,listNo);
        
       return pst.executeUpdate()>0;
   
   }  
   
   public static String getCusGroupNo(String groupNo) throws ClassNotFoundException, SQLException{
    
    String Quary ="SELECT DISTINCT groupno FROM  customergroupmatrixpricelist WHERE deleteyes= 'N' and groupno ='"+groupNo+"'";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            groupNo= rst.getString("groupno");  
         } else{
        
            groupNo="NO";
         
         }
    
    return groupNo;
    }
   
   
    
}

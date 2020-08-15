
package bw.randiyadahara.wsims.controler;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.Customer;
import bw.randiyadahara.wsims.model.CustomerGroupmatrixPriceList;
import bw.randiyadahara.wsims.model.UsageMatrixPriceList;
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
public class UsageMatrixPriceListControler {
    
     public  static String getPriceListNo() throws ClassNotFoundException, SQLException{
    
      String gcNo; 
      int numberPart;
      String TxtPart;
        
       String Quary ="select umplno FROM usagematrixpriceList where usagemax_id=(select max(usagemax_id)from usagematrixpriceList)";
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
    
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);    
        if(rst.next()){
         
            gcNo= rst.getString("umplno");
            TxtPart =gcNo.substring(0,3);
            numberPart =Integer.parseInt(gcNo.substring(3));
            numberPart++;
            
            gcNo=TxtPart+numberPart;
            
         } else{
         
         gcNo ="PLO1";
         }
    
     return  gcNo;
     
    }
     
   public  static ArrayList<Customer> getCustomerGroup() throws ClassNotFoundException, SQLException{

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
    
   public static boolean addNewPriceList(UsageMatrixPriceList umpl, ArrayList<CustomerGroupmatrixPriceList> PriceListDetails) throws SQLException, ClassNotFoundException{
    
     String QuaryAddEMP="INSERT INTO usagematrixpriceList (discription,isactive,createddate,createby,name,umplno,deleteyes) VALUES (?,?,?,?,?,?,?)";
        
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
       try{
       connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMP);    
        pst.setObject(1,umpl.getDiscription());
        pst.setObject(2,umpl.getIsactive());
        pst.setObject(3,umpl.getCreatedDate());
        pst.setObject(4, umpl.getCreatedby());
        pst.setObject(5,umpl.getName());
        pst.setObject(6,umpl.getUmextrixPriceLNo());
        pst.setObject(7, umpl.getDeteteYes());
        
        
        int result =pst.executeUpdate();
        
        if(result>0){
        
         boolean rslt =  CustomerGroupUsageMatrixPriceListCotroler .addPriceList(PriceListDetails);
         
                if(rslt){
                        connection.commit();
                        return true;

                }else{
                        connection.rollback();
                        return false;

                }
         
        }else{
            
            return  false;
        
        }
         
       
       
       
       }finally{
       
       connection.setAutoCommit(true);
       } 
        
      
    }      
    
   public static boolean updatePriceList(UsageMatrixPriceList umpl, ArrayList<CustomerGroupmatrixPriceList> PriceListDetails) throws SQLException, ClassNotFoundException{
    
     String QuaryAddEMP="UPDATE usagematrixpricelist SET discription =?,isactive =? ,updateddate =?,name=? ,updatedby =? ,deleteyes =? WHERE umplno =? ";
        
        
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
       
       try{
       connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(QuaryAddEMP);    
        pst.setObject(1,umpl.getDiscription());
        pst.setObject(2,umpl.getIsactive());
        pst.setObject(3,umpl.getUpdateDate());
        pst.setObject(4,umpl.getName());
        pst.setObject(5, umpl.getUpdateBy());
        pst.setObject(6, umpl.getDeteteYes());
        pst.setObject(7,umpl.getUmextrixPriceLNo());
       
        
        
        int result =pst.executeUpdate();
        
        if(result>0){
        
         boolean rslt =  CustomerGroupUsageMatrixPriceListCotroler.updatePriceList(PriceListDetails);
         
                if(rslt){
                        connection.commit();
                        return true;

                }else{
                        connection.rollback();
                        return false;
                }
         
        }else{
            return  false;
        
        }
        
       }finally{
       
       connection.setAutoCommit(true);
       } 
        
      
    }  
  
   
      public  static ArrayList<UsageMatrixPriceList> searchPriceList(String priceListNo) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT DISTINCT u.umplno, u.name,c.name,u.isactive,u.discription FROM usagematrixpricelist u LEFT JOIN customergroupmatrixpricelist uc ON uc.umplno=u.umplno LEFT JOIN customergroup c ON c.groupno =uc.groupno WHERE u.deleteyes ='N' and  u.umplno='"+priceListNo+"'";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<UsageMatrixPriceList> SearchUsageMatrixPriceList = new ArrayList<>();
        
         while (rst.next()){
            
            UsageMatrixPriceList list = new UsageMatrixPriceList();
            
            list.setUmextrixPriceLNo(rst.getString(1));
            list.setName(rst.getString(2));
            list.setDeteteYes(rst.getString(3));
            list.setIsactive(rst.getString(4));
            list.setDiscription(rst.getString(5));
            
            SearchUsageMatrixPriceList.add(list);
            
        }
    
    return   SearchUsageMatrixPriceList;
    
    }
    public  static ArrayList<UsageMatrixPriceList> viewAllPriceList() throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT DISTINCT u.umplno, u.name,c.name,u.isactive,u.discription FROM usagematrixpricelist u LEFT JOIN customergroupmatrixpricelist uc ON uc.umplno=u.umplno LEFT JOIN customergroup c ON c.groupno =uc.groupno WHERE u.deleteyes ='N'";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<UsageMatrixPriceList> allUsageMatrixPriceList = new ArrayList<>();
        
         while (rst.next()){
            
            UsageMatrixPriceList list = new UsageMatrixPriceList();
            
            list.setUmextrixPriceLNo(rst.getString(1));
            list.setName(rst.getString(2));
            list.setDeteteYes(rst.getString(3));
            list.setIsactive(rst.getString(4));
            list.setDiscription(rst.getString(5));
            
            allUsageMatrixPriceList.add(list);
            
        }
    
    return allUsageMatrixPriceList;
    
    }
    
    
    public static boolean deletePriceList(String PriceListNo) throws ClassNotFoundException, SQLException{
        
       String Quary="UPDATE usagematrixpricelist SET deleteyes =? WHERE umplno =? ";
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection(); 
        try{
       connection.setAutoCommit(false);
        PreparedStatement pst = connection.prepareStatement(Quary);    
        pst.setObject(1,"Y");
        pst.setObject(2,PriceListNo);
        
        int result =pst.executeUpdate();
        
        if(result>0){
           
                boolean rsut = CustomerGroupUsageMatrixPriceListCotroler.deletePriceListLine(PriceListNo);
                    if(rsut){
                        connection.setAutoCommit(true);
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

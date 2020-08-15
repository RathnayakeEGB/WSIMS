
package bw.randiyadahara.wsims.controler.invoice.controler;
 
import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.invoice.PriceListOfCustomerGroup;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PriceListControler {
    
    public  static ArrayList<PriceListOfCustomerGroup > getCustomerGroupPriceList(String CusGroupNO) throws ClassNotFoundException, SQLException{
    
        String Quary ="SELECT fromunite, tounite, rate,groupno FROM customergroupmatrixpricelist WHERE groupno ='"+CusGroupNO+"' and deleteyes='N'  ORDER BY fromunite ";
    
    
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(Quary);
    
        ArrayList<PriceListOfCustomerGroup > plocgs = new ArrayList<>();
        
         while (rst.next()){
            
            PriceListOfCustomerGroup pl = new PriceListOfCustomerGroup();
            
            pl.setFromUnits(rst.getInt(1));
            pl.setTounits(rst.getInt(2));
            pl.setRate(rst.getFloat(3));
            pl.setGroupNo(rst.getString(4));
           
            
            
             plocgs.add(pl);
            
        }
    
    return plocgs;
    
    } 
    
    
    
    
}

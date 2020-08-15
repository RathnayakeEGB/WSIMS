
package bw.randiyadahara.wsims.model.invoice;

import bw.randiyadahara.wsims.controler.invoice.controler.PriceListControler;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author RATHNAYAKA
 */
public class CalculateBillAmount {
    
    public  static  float  comsuptionUnitesChages(int Units ,String cusGroupNo) throws ClassNotFoundException, SQLException{
    
          ArrayList<PriceListOfCustomerGroup >  plc = PriceListControler.getCustomerGroupPriceList(cusGroupNo);
           
           float total = 0,price;
           int sUnits,eUnits ,remain,units;
           int lastremain = 0;
           units=Units;
           remain =units;
           for(PriceListOfCustomerGroup plcg : plc){
           
                 sUnits=  plcg.getFromUnits();
                 eUnits=  plcg.getTounits();
                 price =plcg.getRate();
                 
                 if((eUnits-sUnits)>100){
                  lastremain =remain;   
                  remain =remain-remain;
                  
                 }else{
                     lastremain=remain;
                     remain =remain-(eUnits-sUnits);
                 
                        if(remain<=0){
                            lastremain=lastremain;
                          }
                 
                 }
                 
                 if(remain<=0){   
                  total=total+(price*lastremain);   
                  return total;
                 
                 }else{
                 
                 total=total+(price*(eUnits-sUnits));
                     
                 }
             
           }
    
    return 4 ;
    }
    
    
}

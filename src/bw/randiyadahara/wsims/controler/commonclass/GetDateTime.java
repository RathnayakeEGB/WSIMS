
package bw.randiyadahara.wsims.controler;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
//import org.apache.derby.client.am.DateTime;


public class GetDateTime {
    

  
 public String createdTime(){
 

     
            Date d = new Date();
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateTime=(Date.format(d));
            
          return dateTime;
                  

 }
    
 public SimpleDateFormat DateTime(){
 
    Date d = new Date();
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            
          return Date;
 
 
 }
 
 
public java.sql. Timestamp CurrentDateTime(){



Timestamp timestamp = new Timestamp(System.currentTimeMillis());

return timestamp;
        
 }

 
 
}

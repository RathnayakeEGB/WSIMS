
package bw.randiyadahara.wsims.controler;

import java.sql.SQLException;


public class ConnectionString {
    

  public  static  String url() throws SQLException{
    
      int Password =123;
      
      
      
String url = "jdbc:postgresql://localhost:5432/WSIMS";


    return url;
    }
    
 public static String userName(){
 
     
     
 return "Admin";
    }
 
 public static String PassWord(){
 
 return "1234";
 
    }
    
}

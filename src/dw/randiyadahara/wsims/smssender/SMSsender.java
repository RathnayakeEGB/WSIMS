
package dw.randiyadahara.wsims.smssender;
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

public class SMSsender {
    
   
    public  static String SendSMS () throws MalformedURLException, IOException{
   
   String apiKey = "apikey=" + URLEncoder.encode("u3IQK/UgWbo-N3g5f1h3ssA6TbJr9oMwM1NdlQg5hP", "UTF-8");
			String message = "&message=" + URLEncoder.encode("This is your message", "UTF-8");
			String sender = "&sender=" + URLEncoder.encode("E.G.B", "UTF-8");
			String numbers = "&numbers=" + URLEncoder.encode("0716548460", "UTF-8");
    
                        String data = "https://api.txtlocal.com/send/?" + apiKey + numbers + message + sender;
			URL url = new URL(data);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
      
                        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			String sResult="";
			while ((line = rd.readLine()) != null) {
			// Process line...
				sResult=sResult+line+" ";
			}
			rd.close();
			
			return sResult;
        
  
 
    
}
    
  }

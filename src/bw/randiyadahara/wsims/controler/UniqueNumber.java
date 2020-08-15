
package bw.randiyadahara.wsims.controler;


public class UniqueNumber {
 
    public String getNumber(String qNumber){
    
        int NumberPart ;
        String txtPart ;
         String number;
        
            if(qNumber==null){

              number="JNO1" ;
            }
            else{
                
            NumberPart = Integer.parseInt(qNumber.substring(3));
            txtPart =qNumber.substring(0,3);

            ++NumberPart;

            number =txtPart+NumberPart;
        
        }
       
         
    
    return number;
    }
    
    public String JobNo(String jno){
    
    String uper =jno.toUpperCase();
    
   
    return uper    ;   
    
    
}
    
    
    public String empNo(String empNo){
    
        String employeeNo =empNo;
        
        String txtPart="";
        int numberPart ;
        
        if(empNo== null){
        
          employeeNo="EMP01";  
            
        }else{
        
          txtPart =empNo.substring(0,3);
          numberPart =Integer.parseInt(empNo.substring(3));
          
          ++numberPart;
          
          employeeNo=txtPart+numberPart;
          
        }
        
        
       
        
    
    return employeeNo;
    }
    
}

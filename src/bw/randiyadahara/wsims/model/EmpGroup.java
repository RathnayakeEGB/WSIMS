
package bw.randiyadahara.wsims.model;


public class EmpGroup {

    EmpGroup(String aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    EmpGroup(String aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    EmpGroup(String aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    String  groupNo,title,discription,isActive;
    
    
 public   EmpGroup(String groupNo,String title,String discription,String isActive){
    
        this.groupNo =groupNo;
        this.title =title;
        this.discription=discription;
        this.isActive=isActive;
    
    }
    
 public String getGroupNo(){
     
     
 
 return groupNo;
 }
 
  public String getTitle(){
     
     
 
 return title;
 }
   
   public String getDiscription(){
     
     
 
 return discription;
 } 
   
 public String getIsactive(){
     
     
 
 return isActive;
 }  
   
}

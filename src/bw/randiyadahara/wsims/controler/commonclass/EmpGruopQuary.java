
package bw.randiyadahara.wsims.controler.commonclass;


public class EmpGruopQuary {
   
    EmpGruopQuary(String groupNo,String title,String discription,String isActive){
    
    
    }
    
    
    static String EmpgroupSelectQuary="Select  jobNo,title,discription,isactive from empgroup where deleteYes ='N' order by jobno ";
    static String InsertQuary ="insert into empgroup (groupno,title,discription,isactive,createdBy,createDate,deleteYes) values";
    
}

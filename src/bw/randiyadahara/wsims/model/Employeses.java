
package bw.randiyadahara.wsims.model;

import java.sql.Timestamp;


public class Employeses {
 
    private String empNo;
    private String Inc;
    private String name;
    private String Address;
    private String gender;
    private int tele;
    private String isactive;
    private Timestamp createdDate;
    private Timestamp updateDate;
    private int Jobid ;
    private int Createdby;
    private String Discription;
    private String jobno;
    private String deleteYes;
    private int updateBy;
    private String jobTitle;
    
    public Employeses() {
    }

    public Employeses(String empNo, String Inc, String name, String Address, String gender, int tele, String isactive, Timestamp createdDate, int Jobid, int Createdby, String Discription, String jobno, String deleteYes, Timestamp updateDate, int updateBy,String jobTitle) {
        this.empNo = empNo;
        this.Inc = Inc;
        this.name = name;
        this.Address = Address;
        this.gender = gender;
        this.tele = tele;
        this.isactive = isactive;
        this.createdDate = createdDate;
        this.Jobid = Jobid;
        this.Createdby = Createdby;
        this.Discription = Discription;
        this.jobno = jobno;
        this.deleteYes = deleteYes;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.jobTitle= jobTitle;
    }

   
    
    
    
     public String jobTitle() {
        return jobTitle;
    }
    
    
    public void jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    } 
    
    
    
    public String getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * @return the Inc
     */
    public String getInc() {
        return Inc;
    }

    /**
     * @param Inc the Inc to set
     */
    public void setInc(String Inc) {
        this.Inc = Inc;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the tele
     */
    public int getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(int tele) {
        this.tele = tele;
    }

    /**
     * @return the isactive
     */
    public String getIsactive() {
        return isactive;
    }

    /**
     * @param isactive the isactive to set
     */
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    /**
     * @return the createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the Jobid
     */
    public int getJobid() {
        return Jobid;
    }

    /**
     * @param Jobid the Jobid to set
     */
    public void setJobid(int Jobid) {
        this.Jobid = Jobid;
    }

    /**
     * @return the Createdby
     */
    public int getCreatedby() {
        return Createdby;
    }

    /**
     * @param Createdby the Createdby to set
     */
    public void setCreatedby(int Createdby) {
        this.Createdby = Createdby;
    }

    /**
     * @return the Discription
     */
    public String getDiscription() {
        return Discription;
    }

    /**
     * @param Discription the Discription to set
     */
    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }

    /**
     * @return the jobno
     */
    public String getJobno() {
        return jobno;
    }

    /**
     * @param jobno the jobno to set
     */
    public void setJobno(String jobno) {
        this.jobno = jobno;
    }

    /**
     * @return the deleteYes
     */
    public String getDeleteYes() {
        return deleteYes;
    }

    /**
     * @param deleteYes the deleteYes to set
     */
    public void setDeleteYes(String deleteYes) {
        this.deleteYes = deleteYes;
    }

    /**
     * @return the updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the updateBy
     */
    public int getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy the updateBy to set
     */
    public void setUpdateBy(int updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "Employeses{" + "empNo=" + empNo + ", Inc=" + Inc + ", name=" + name + ", Address=" + Address + ", gender=" + gender + ", tele=" + tele + ", isactive=" + isactive + ", createdDate=" + createdDate + ", Jobid=" + Jobid + ", Createdby=" + Createdby + ", Discription=" + Discription + ", jobno=" + jobno + ", deleteYes=" + deleteYes + ", updateDate=" + updateDate + ", updateBy=" + updateBy + '}';
    }

    public void getCreatedDate(Timestamp createDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

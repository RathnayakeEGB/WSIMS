
package bw.randiyadahara.wsims.model;

import java.awt.image.BufferedImage;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;


public class Customer {

    public Customer() {
        
    }
     private String cusNo;
     private String subCno;
     private String groupNo;
     private String nic;
     private String Phone;
     private String name;
     private String url ;
     private String nameWI;
     private String Address;
     private String gender;
     private int tele;
     private String isactive;
     private Timestamp createdDate;
     private int Jobid;
     private int Createdby;
     private String Discription;
     private String jobno;
     private String deleteYes;
     private Timestamp updateDate;
     private int updateBy;
     private String jobTitle;
     private BufferedImage originalImage;
     private byte[] userimage;
     private double openBalance;
     private float opBalance;
     private java.sql.Date regDate;
     private String subCommiteName;
     private String customerGroupName;
     

    public Customer(String cusNo, String subCno, String groupNo, String nic, String Phone, String name, String url, String nameWI, String Address, String gender, int tele, String isactive, Timestamp createdDate, int Jobid, int Createdby, String Discription, String jobno, String deleteYes, Timestamp updateDate, int updateBy, String jobTitle, BufferedImage originalImage, byte[] userimage, double openBalance, float opBalance, Date regDate, String subCommiteName, String customerGroupName) {
        this.cusNo = cusNo;
        this.subCno = subCno;
        this.groupNo = groupNo;
        this.nic = nic;
        this.Phone = Phone;
        this.name = name;
        this.url = url;
        this.nameWI = nameWI;
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
        this.jobTitle = jobTitle;
        this.originalImage = originalImage;
        this.userimage = userimage;
        this.openBalance = openBalance;
        this.opBalance = opBalance;
        this.regDate = regDate;
        this.subCommiteName = subCommiteName;
        this.customerGroupName = customerGroupName;
    }
     


    /**
     * @return the cusNo
     */
    public String getCusNo() {
        return cusNo;
    }

    /**
     * @param cusNo the cusNo to set
     */
    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    /**
     * @return the subCno
     */
    public String getSubCno() {
        return subCno;
    }

    /**
     * @param subCno the subCno to set
     */
    public void setSubCno(String subCno) {
        this.subCno = subCno;
    }

    /**
     * @return the groupNo
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo the groupNo to set
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
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
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the nameWI
     */
    public String getNameWI() {
        return nameWI;
    }

    /**
     * @param nameWI the nameWI to set
     */
    public void setNameWI(String nameWI) {
        this.nameWI = nameWI;
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

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the originalImage
     */
    public BufferedImage getOriginalImage() {
        return originalImage;
    }

    /**
     * @param originalImage the originalImage to set
     */
    public void setOriginalImage(BufferedImage originalImage) {
        this.originalImage = originalImage;
    }

    /**
     * @return the userimage
     */
    public byte[] getUserimage() {
        return userimage;
    }

    /**
     * @param userimage the userimage to set
     */
    public void setUserimage(byte[] userimage) {
        this.setUserimage(userimage);
    }

    /**
     * @return the openBalance
     */
    public double getOpenBalance() {
        return openBalance;
    }

    /**
     * @param openBalance the openBalance to set
     */
    public void setOpenBalance(double openBalance) {
        this.openBalance = openBalance;
    }

    /**
     * @return the opBalance
     */
    public float getOpBalance() {
        return opBalance;
    }

    /**
     * @param opBalance the opBalance to set
     */
    public void setOpBalance(float opBalance) {
        this.opBalance = opBalance;
    }

    /**
     * @return the regDate
     */
    public java.sql.Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(java.sql.Date regDate) {
        this.regDate = regDate;
    }

    /**
     * @param userimage the userimage to set
     */
  //  public void setUserimage(byte[] userimage) {
      //  this.userimage = userimage;
   // }

    /**
     * @return the subCommiteName
     */
    public String getSubCommiteName() {
        return subCommiteName;
    }

    /**
     * @param subCommiteName the subCommiteName to set
     */
    public void setSubCommiteName(String subCommiteName) {
        this.subCommiteName = subCommiteName;
    }

    /**
     * @return the customerGroupName
     */
    public String getCustomerGroupName() {
        return customerGroupName;
    }

    /**
     * @param customerGroupName the customerGroupName to set
     */
    public void setCustomerGroupName(String customerGroupName) {
        this.customerGroupName = customerGroupName;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusNo=" + cusNo + ", subCno=" + subCno + ", groupNo=" + groupNo + ", nic=" + nic + ", Phone=" + Phone + ", name=" + name + ", url=" + url + ", nameWI=" + nameWI + ", Address=" + Address + ", gender=" + gender + ", tele=" + tele + ", isactive=" + isactive + ", createdDate=" + createdDate + ", Jobid=" + Jobid + ", Createdby=" + Createdby + ", Discription=" + Discription + ", jobno=" + jobno + ", deleteYes=" + deleteYes + ", updateDate=" + updateDate + ", updateBy=" + updateBy + ", jobTitle=" + jobTitle + ", originalImage=" + originalImage + ", userimage=" + Arrays.toString(userimage) + ", openBalance=" + openBalance + ", opBalance=" + opBalance + ", regDate=" + regDate + ", subCommiteName=" + subCommiteName + ", customerGroupName=" + customerGroupName + '}';
    }

   

    
}

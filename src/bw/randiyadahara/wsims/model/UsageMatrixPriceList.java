
package bw.randiyadahara.wsims.model;

import java.sql.Timestamp;


public class UsageMatrixPriceList {

    public UsageMatrixPriceList() {
    }
    
     private String name;
     private String temp;
     private String isactive;
     private Timestamp createdDate;
     private Timestamp updateDate;
     private int updateBy;
     private int Createdby;
     private String discription;
     private String UmextrixPriceLNo;
     private String deteteYes;

    
  
    public UsageMatrixPriceList(String name, String temp, String isactive, Timestamp createdDate, Timestamp updateDate, int updateBy, int Createdby, String discription, String UmextrixPriceLNo, String deteteYes) {
        this.name = name;
        this.temp = temp;
        this.isactive = isactive;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.Createdby = Createdby;
        this.discription = discription;
        this.UmextrixPriceLNo = UmextrixPriceLNo;
        this.deteteYes = deteteYes;
    }

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
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
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
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the UmextrixPriceLNo
     */
    public String getUmextrixPriceLNo() {
        return UmextrixPriceLNo;
    }

    /**
     * @param UmextrixPriceLNo the UmextrixPriceLNo to set
     */
    public void setUmextrixPriceLNo(String UmextrixPriceLNo) {
        this.UmextrixPriceLNo = UmextrixPriceLNo;
    }

    @Override
    public String toString() {
        return "UsageMatrixPriceList{" + "name=" + getName() + ", temp=" + getTemp() + ", isactive=" + getIsactive() + ", createdDate=" + getCreatedDate() + ", updateDate=" + getUpdateDate() + ", updateBy=" + getUpdateBy() + ", Createdby=" + getCreatedby() + ", discription=" + getDiscription() + ", UmextrixPriceLNo=" + getUmextrixPriceLNo() + '}';
    }

    /**
     * @return the deteteYes
     */
    public String getDeteteYes() {
        return deteteYes;
    }

    /**
     * @param deteteYes the deteteYes to set
     */
    public void setDeteteYes(String deteteYes) {
        this.deteteYes = deteteYes;
    }
     
}

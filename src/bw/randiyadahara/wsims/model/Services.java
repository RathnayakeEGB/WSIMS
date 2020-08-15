
package bw.randiyadahara.wsims.model;

import java.sql.Date;
import java.sql.Timestamp;


public class Services {

    public Services() {
    }
    
    
    private String discription;
    private String serviceNo;
    private String name;
    private String serviceType;
    private String isActive;
    private String temp;
    private String deleteYes;
    private int userId;
    private int createdBy;
    private int updatedBy;
    private float rate;
    private float amount;
    private Timestamp cratedDate;
    private Timestamp updatedDate;
    private java.sql.Date tempDate; 
    private String type;

    public Services(String discription, String serviceNo, String name, String serviceType, String isActive, String temp, String deleteYes, int userId, int createdBy, int updatedBy, float rate, float amount, Timestamp cratedDate, Timestamp updatedDate, Date tempDate, String type) {
        this.discription = discription;
        this.serviceNo = serviceNo;
        this.name = name;
        this.serviceType = serviceType;
        this.isActive = isActive;
        this.temp = temp;
        this.deleteYes = deleteYes;
        this.userId = userId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.rate = rate;
        this.amount = amount;
        this.cratedDate = cratedDate;
        this.updatedDate = updatedDate;
        this.tempDate = tempDate;
        this.type = type;
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
     * @return the serviceNo
     */
    public String getServiceNo() {
        return serviceNo;
    }

    /**
     * @param serviceNo the serviceNo to set
     */
    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
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
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the isActive
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
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
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the createdBy
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the updatedBy
     */
    public int getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return the rate
     */
    public float getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(float rate) {
        this.rate = rate;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the cratedDate
     */
    public Timestamp getCratedDate() {
        return cratedDate;
    }

    /**
     * @param cratedDate the cratedDate to set
     */
    public void setCratedDate(Timestamp cratedDate) {
        this.cratedDate = cratedDate;
    }

    /**
     * @return the updatedDate
     */
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    /**
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * @return the tempDate
     */
    public java.sql.Date getTempDate() {
        return tempDate;
    }

    /**
     * @param tempDate the tempDate to set
     */
    public void setTempDate(java.sql.Date tempDate) {
        this.tempDate = tempDate;
    }

    @Override
    public String toString() {
        return "Services{" + "discription=" + getDiscription() + ", serviceNo=" + getServiceNo() + ", name=" + getName() + ", serviceType=" + getServiceType() + ", isActive=" + getIsActive() + ", temp=" + getTemp() + ", deleteYes=" + getDeleteYes() + ", userId=" + getUserId() + ", createdBy=" + getCreatedBy() + ", updatedBy=" + getUpdatedBy() + ", rate=" + getRate() + ", amount=" + getAmount() + ", cratedDate=" + getCratedDate() + ", updatedDate=" + getUpdatedDate() + ", tempDate=" + getTempDate() + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
    
}

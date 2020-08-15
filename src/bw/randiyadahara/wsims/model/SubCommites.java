
package bw.randiyadahara.wsims.model;

import java.sql.Date;
import java.sql.Timestamp;


public class SubCommites {

    public SubCommites() {
        
    }
    
    
    
    private String No;
    private String Name;
    private String discription;
    private String isActive;
    private String deleteYes;
    private int userId;
    private int createdBy;
    private int updatedBy;
    private Timestamp cratedDate;
    private Timestamp updatedDate;
    private java.sql.Date tempDate;

    public SubCommites(String No, String Name, String discription, String isActive, String deleteYes, int userId, int createdBy, int updatedBy, Timestamp cratedDate, Timestamp updatedDate, Date tempDate) {
        this.No = No;
        this.Name = Name;
        this.discription = discription;
        this.isActive = isActive;
        this.deleteYes = deleteYes;
        this.userId = userId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.cratedDate = cratedDate;
        this.updatedDate = updatedDate;
        this.tempDate = tempDate;
    }

    /**
     * @return the No
     */
    public String getNo() {
        return No;
    }

    /**
     * @param No the No to set
     */
    public void setNo(String No) {
        this.No = No;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
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
        return "SubCommitee{" + "No=" + No + ", Name=" + Name + ", discription=" + discription + ", isActive=" + isActive + ", deleteYes=" + deleteYes + ", userId=" + userId + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", cratedDate=" + cratedDate + ", updatedDate=" + updatedDate + ", tempDate=" + tempDate + '}';
    }
    
    
}

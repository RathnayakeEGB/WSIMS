
package bw.randiyadahara.wsims.model;

import java.sql.Timestamp;


public class FixCost {

    public FixCost() {
    }
    
    private String fixCNo;
    private String Name;
    private String discription;
    private String CusGroupNo;
    private String deleteYes;
    private String isActive;
    private float fixCost;
    private int DueDate;
    private int createdBy;
    private int UpdatedBy;
    private Timestamp createdDate;
    private Timestamp updateDate;
    private float lateChageRate;
    private int lineCutMonth;
    private float connctionRenue;

    public FixCost(String fixCNo, String Name, String discription, String CusGroupNo, String deleteYes, String isActive, float fixCost, int DueDate, int createdBy, int UpdatedBy, Timestamp createdDate, Timestamp updateDate, float lateChageRate, int lineCutMonth, float connctionRenue) {
        this.fixCNo = fixCNo;
        this.Name = Name;
        this.discription = discription;
        this.CusGroupNo = CusGroupNo;
        this.deleteYes = deleteYes;
        this.isActive = isActive;
        this.fixCost = fixCost;
        this.DueDate = DueDate;
        this.createdBy = createdBy;
        this.UpdatedBy = UpdatedBy;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.lateChageRate = lateChageRate;
        this.lineCutMonth = lineCutMonth;
        this.connctionRenue = connctionRenue;
    }

  

 

    /**
     * @return the fixCNo
     */
    public String getFixCNo() {
        return fixCNo;
    }

    /**
     * @param fixCNo the fixCNo to set
     */
    public void setFixCNo(String fixCNo) {
        this.fixCNo = fixCNo;
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
     * @return the CusGroupNo
     */
    public String getCusGroupNo() {
        return CusGroupNo;
    }

    /**
     * @param CusGroupNo the CusGroupNo to set
     */
    public void setCusGroupNo(String CusGroupNo) {
        this.CusGroupNo = CusGroupNo;
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
     * @return the fixCost
     */
    public float getFixCost() {
        return fixCost;
    }

    /**
     * @param fixCost the fixCost to set
     */
    public void setFixCost(float fixCost) {
        this.fixCost = fixCost;
    }

    /**
     * @return the DueDate
     */
    public int getDueDate() {
        return DueDate;
    }

    /**
     * @param DueDate the DueDate to set
     */
    public void setDueDate(int DueDate) {
        this.DueDate = DueDate;
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
     * @return the UpdatedBy
     */
    public int getUpdatedBy() {
        return UpdatedBy;
    }

    /**
     * @param UpdatedBy the UpdatedBy to set
     */
    public void setUpdatedBy(int UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
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
     * @return the lageChageRate
     */
    public float getLateChageRate() {
        return lateChageRate;
    }

    /**
     * @param lageChageRate the lageChageRate to set
     */
    public void setLateChageRate(float lageChageRate) {
        this.lateChageRate = lageChageRate;
    }

    /**
     * @return the lineCutMonth
     */
    public int getLineCutMonth() {
        return lineCutMonth;
    }

    /**
     * @param lineCutMonth the lineCutMonth to set
     */
    public void setLineCutMonth(int lineCutMonth) {
        this.lineCutMonth = lineCutMonth;
    }

   
    public float getConnctionRenue() {
        return connctionRenue;
    }

    /**
     * @param connctionRenue the connctionRenue to set
     */
    public void setConnctionRenue(float connctionRenue) {
        this.connctionRenue = connctionRenue;
    }

    @Override
    public String toString() {
        return "FixCost{" + "fixCNo=" + fixCNo + ", Name=" + Name + ", discription=" + discription + ", CusGroupNo=" + CusGroupNo + ", deleteYes=" + deleteYes + ", isActive=" + isActive + ", fixCost=" + fixCost + ", DueDate=" + DueDate + ", createdBy=" + createdBy + ", UpdatedBy=" + UpdatedBy + ", createdDate=" + createdDate + ", updateDate=" + updateDate + ", lateChageRate=" + lateChageRate + ", lineCutMonth=" + lineCutMonth + ", connctionRenue=" + connctionRenue + '}';
    }
    
}

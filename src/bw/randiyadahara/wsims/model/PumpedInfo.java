
package bw.randiyadahara.wsims.model;

import java.sql.Date;
import java.sql.Timestamp;


public class PumpedInfo {
    
    
    private String Pno;
    private String discription;
    private String deleteYes;
    private String isActive;
    private int createdBy;
    private int updatedBy;
    private float startUnits;         
    private float endUnite;
    private float quntity;
    private float amount;
    private Timestamp cratedDate;
    private Timestamp updatedDate;
    private java.sql.Date pumpDate;
    private java.sql.Date date;
    private int year;
    private float sGap;
    private float Egap;
    private float qtyGap;

    public PumpedInfo(String Pno, String discription, String deleteYes, String isActive, int createdBy, int updatedBy, float startUnits, float endUnite, float quntity, float amount, Timestamp cratedDate, Timestamp updatedDate, Date pumpDate, Date date, int year, float sGap, float Egap, float qtyGap) {
        this.Pno = Pno;
        this.discription = discription;
        this.deleteYes = deleteYes;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.startUnits = startUnits;
        this.endUnite = endUnite;
        this.quntity = quntity;
        this.amount = amount;
        this.cratedDate = cratedDate;
        this.updatedDate = updatedDate;
        this.pumpDate = pumpDate;
        this.date = date;
        this.year = year;
        this.sGap = sGap;
        this.Egap = Egap;
        this.qtyGap = qtyGap;
    }
  
    public PumpedInfo() {
    }
    
    



    /**
     * @return the Pno
     */
    public String getPno() {
        return Pno;
    }

    /**
     * @param Pno the Pno to set
     */
    public void setPno(String Pno) {
        this.Pno = Pno;
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
     * @return the startUnits
     */
    public float getStartUnits() {
        return startUnits;
    }

    /**
     * @param startUnits the startUnits to set
     */
    public void setStartUnits(float startUnits) {
        this.startUnits = startUnits;
    }

    /**
     * @return the endUnite
     */
    public float getEndUnite() {
        return endUnite;
    }

    /**
     * @param endUnite the endUnite to set
     */
    public void setEndUnite(float endUnite) {
        this.endUnite = endUnite;
    }

    /**
     * @return the quntity
     */
    public float getQuntity() {
        return quntity;
    }

    /**
     * @param quntity the quntity to set
     */
    public void setQuntity(float quntity) {
        this.quntity = quntity;
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
     * @return the pumpDate
     */
    public java.sql.Date getPumpDate() {
        return pumpDate;
    }

    /**
     * @param pumpDate the pumpDate to set
     */
    public void setPumpDate(java.sql.Date pumpDate) {
        this.pumpDate = pumpDate;
    }

    /**
     * @return the date
     */
    public java.sql.Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(java.sql.Date date) {
        this.date = date;
    }

   

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

   

    public float getsGap() {
        return sGap;
    }

    /**
     * @param sGap the sGap to set
     */
    public void setsGap(float sGap) {
        this.sGap = sGap;
    }

    /**
     * @return the Egap
     */
    public float getEgap() {
        return Egap;
    }

    /**
     * @param Egap the Egap to set
     */
    public void setEgap(float Egap) {
        this.Egap = Egap;
    }

    /**
     * @return the qtyGap
     */
    public float getQtyGap() {
        return qtyGap;
    }

    /**
     * @param qtyGap the qtyGap to set
     */
    public void setQtyGap(float qtyGap) {
        this.qtyGap = qtyGap;
    }

    @Override
    public String toString() {
        return "PumpedInfo{" + "Pno=" + Pno + ", discription=" + discription + ", deleteYes=" + deleteYes + ", isActive=" + isActive + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", startUnits=" + startUnits + ", endUnite=" + endUnite + ", quntity=" + quntity + ", amount=" + amount + ", cratedDate=" + cratedDate + ", updatedDate=" + updatedDate + ", pumpDate=" + pumpDate + ", date=" + date + ", year=" + year + ", sGap=" + sGap + ", Egap=" + Egap + ", qtyGap=" + qtyGap + '}';
    }
    
    
}

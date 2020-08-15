
package bw.randiyadahara.wsims.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author RATHNAYAKA
 */
public class WaterConsumption {
    
    private String cusRegNo;
    private String comsuptionNo;
    private String customerName;
    private String description;
    private String isactive;
    private String deleteYes;
    private String readBy;
    private String temp;
    private float stratUnits;
    private float endUnits;
    private float comsuptionUnits;
    private int updatedBY;
    private int createdBY;
    private int month;
    private int year;
    private Timestamp updatedDate,createdDate;
    private java.sql.Date mReadDate;

    public WaterConsumption() {
    }

    public WaterConsumption(String cusRegNo, String comsuptionNo, String customerName, String description, String isactive, String deleteYes, String readBy, String temp, float stratUnits, float endUnits, float comsuptionUnits, int updatedBY, int createdBY, int month, int year, Timestamp updatedDate, Timestamp createdDate, Date mReadDate) {
        this.cusRegNo = cusRegNo;
        this.comsuptionNo = comsuptionNo;
        this.customerName = customerName;
        this.description = description;
        this.isactive = isactive;
        this.deleteYes = deleteYes;
        this.readBy = readBy;
        this.temp = temp;
        this.stratUnits = stratUnits;
        this.endUnits = endUnits;
        this.comsuptionUnits = comsuptionUnits;
        this.updatedBY = updatedBY;
        this.createdBY = createdBY;
        this.month = month;
        this.year = year;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
        this.mReadDate = mReadDate;
    }

    /**
     * @return the cusRegNo
     */
    public String getCusRegNo() {
        return cusRegNo;
    }

    /**
     * @param cusRegNo the cusRegNo to set
     */
    public void setCusRegNo(String cusRegNo) {
        this.cusRegNo = cusRegNo;
    }

    /**
     * @return the comsuptionNo
     */
    public String getComsuptionNo() {
        return comsuptionNo;
    }

    /**
     * @param comsuptionNo the comsuptionNo to set
     */
    public void setComsuptionNo(String comsuptionNo) {
        this.comsuptionNo = comsuptionNo;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the readBy
     */
    public String getReadBy() {
        return readBy;
    }

    /**
     * @param readBy the readBy to set
     */
    public void setReadBy(String readBy) {
        this.readBy = readBy;
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
     * @return the stratUnits
     */
    public float getStratUnits() {
        return stratUnits;
    }

    /**
     * @param stratUnits the stratUnits to set
     */
    public void setStratUnits(float stratUnits) {
        this.stratUnits = stratUnits;
    }

    /**
     * @return the endUnits
     */
    public float getEndUnits() {
        return endUnits;
    }

    /**
     * @param endUnits the endUnits to set
     */
    public void setEndUnits(float endUnits) {
        this.endUnits = endUnits;
    }

    /**
     * @return the comsuptionUnits
     */
    public float getComsuptionUnits() {
        return comsuptionUnits;
    }

    /**
     * @param comsuptionUnits the comsuptionUnits to set
     */
    public void setComsuptionUnits(float comsuptionUnits) {
        this.comsuptionUnits = comsuptionUnits;
    }

    /**
     * @return the updatedBY
     */
    public int getUpdatedBY() {
        return updatedBY;
    }

    /**
     * @param updatedBY the updatedBY to set
     */
    public void setUpdatedBY(int updatedBY) {
        this.updatedBY = updatedBY;
    }

    /**
     * @return the createdBY
     */
    public int getCreatedBY() {
        return createdBY;
    }

    /**
     * @param createdBY the createdBY to set
     */
    public void setCreatedBY(int createdBY) {
        this.createdBY = createdBY;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
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
     * @return the mReadDate
     */
    public java.sql.Date getmReadDate() {
        return mReadDate;
    }

    /**
     * @param mReadDate the mReadDate to set
     */
    public void setmReadDate(java.sql.Date mReadDate) {
        this.mReadDate = mReadDate;
    }

    @Override
    public String toString() {
        return "WaterConsuption{" + "cusRegNo=" + getCusRegNo() + ", comsuptionNo=" + getComsuptionNo() + ", customerName=" + getCustomerName() + ", description=" + getDescription() + ", isactive=" + getIsactive() + ", deleteYes=" + getDeleteYes() + ", readBy=" + getReadBy() + ", temp=" + getTemp() + ", stratUnits=" + getStratUnits() + ", endUnits=" + getEndUnits() + ", comsuptionUnits=" + getComsuptionUnits() + ", updatedBY=" + getUpdatedBY() + ", createdBY=" + getCreatedBY() + ", month=" + getMonth() + ", year=" + getYear() + ", updatedDate=" + getUpdatedDate() + ", createdDate=" + getCreatedDate() + ", mReadDate=" + getmReadDate() + '}';
    }

    public void getCustomerName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

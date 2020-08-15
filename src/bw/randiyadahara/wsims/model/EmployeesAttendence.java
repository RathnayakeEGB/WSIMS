
package bw.randiyadahara.wsims.model;

import java.sql.Date;


public class EmployeesAttendence {

    public EmployeesAttendence() {
    }
    
    private String aID;
    private String empNo;
    private String fName;
    private String isActive;
    private String discription;
    private String status;
    private String deleteYes;
    private String year;
    private String Month;
    private java.sql.Date Updateddate;
    private java.sql.Date createdDate;
    private java.sql.Date date;
    private int CreateBy;
    private int updatedBy;
    private int attendeceID;
    private float hours;
    private String Adate;

    public EmployeesAttendence(String aID, String empNo, String fName, String isActive, String discription, String status, String deleteYes, String year, String Month, Date Updateddate, Date createdDate, Date date, int CreateBy, int updatedBy, int attendeceID, float hours, String Adate) {
        this.aID = aID;
        this.empNo = empNo;
        this.fName = fName;
        this.isActive = isActive;
        this.discription = discription;
        this.status = status;
        this.deleteYes = deleteYes;
        this.year = year;
        this.Month = Month;
        this.Updateddate = Updateddate;
        this.createdDate = createdDate;
        this.date = date;
        this.CreateBy = CreateBy;
        this.updatedBy = updatedBy;
        this.attendeceID = attendeceID;
        this.hours = hours;
        this.Adate = Adate;
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
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the Month
     */
    public String getMonth() {
        return Month;
    }

    /**
     * @param Month the Month to set
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * @return the Updateddate
     */
    public java.sql.Date getUpdateddate() {
        return Updateddate;
    }

    /**
     * @param Updateddate the Updateddate to set
     */
    public void setUpdateddate(java.sql.Date Updateddate) {
        this.Updateddate = Updateddate;
    }

    /**
     * @return the createdDate
     */
    public java.sql.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(java.sql.Date createdDate) {
        this.createdDate = createdDate;
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
     * @return the CreateBy
     */
    public int getCreateBy() {
        return CreateBy;
    }

    /**
     * @param CreateBy the CreateBy to set
     */
    public void setCreateBy(int CreateBy) {
        this.CreateBy = CreateBy;
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
     * @return the attendeceID
     */
    public int getAttendeceID() {
        return attendeceID;
    }

    /**
     * @param attendeceID the attendeceID to set
     */
    public void setAttendeceID(int attendeceID) {
        this.attendeceID = attendeceID;
    }

    /**
     * @return the hours
     */
    public float getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(float hours) {
        this.hours = hours;
    }

    

    /**
     * @return the Adate
     */
    public String getAdate() {
        return Adate;
    }

    /**
     * @param Adate the Adate to set
     */
    public void setAdate(String Adate) {
        this.Adate = Adate;
    }

    @Override
    public String toString() {
        return "EmployeesAttendence{" + "empNo=" + getEmpNo() + ", fName=" + getfName() + ", isActive=" + getIsActive() + ", discription=" + getDiscription() + ", status=" + getStatus() + ", deleteYes=" + getDeleteYes() + ", year=" + getYear() + ", Month=" + getMonth() + ", Updateddate=" + getUpdateddate() + ", createdDate=" + getCreatedDate() + ", date=" + getDate() + ", CreateBy=" + getCreateBy() + ", updatedBy=" + getUpdatedBy() + ", attendeceID=" + getAttendeceID() + ", hours=" + getHours() + ", Adate=" + getAdate() + '}';
    }

    /**
     * @return the aID
     */
    public String getaID() {
        return aID;
    }

    /**
     * @param aID the aID to set
     */
    public void setaID(String aID) {
        this.aID = aID;
    }
    
    
}

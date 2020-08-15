
package bw.randiyadahara.wsims.model;

import java.sql.Date;


public class EmployeesGroup {

    public EmployeesGroup() {
    }
    
            private String jobNo; 
            private String discription ;
            private String name ;
            private java.sql.Date Createddate;
            private int createdBy ;
            private String isactive ;
            private String title;
            private String deleteYes ;
            private int UpdateBy;
            private java.sql.Date Updateddate;
            private String temp;
            private int defult;

    public EmployeesGroup(String jobNo, String discription, String name, Date Createddate, int createdBy, String isactive, String title, String deleteYes, int UpdateBy, Date Updateddate, String temp, int defult) {
        this.jobNo = jobNo;
        this.discription = discription;
        this.name = name;
        this.Createddate = Createddate;
        this.createdBy = createdBy;
        this.isactive = isactive;
        this.title = title;
        this.deleteYes = deleteYes;
        this.UpdateBy = UpdateBy;
        this.Updateddate = Updateddate;
        this.temp = temp;
        this.defult = defult;
    }

    /**
     * @return the jobNo
     */
    public String getJobNo() {
        return jobNo;
    }

    /**
     * @param jobNo the jobNo to set
     */
    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
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
     * @return the Createddate
     */
    public java.sql.Date getCreateddate() {
        return Createddate;
    }

    /**
     * @param Createddate the Createddate to set
     */
    public void setCreateddate(java.sql.Date Createddate) {
        this.Createddate = Createddate;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return the UpdateBy
     */
    public int getUpdateBy() {
        return UpdateBy;
    }

    /**
     * @param UpdateBy the UpdateBy to set
     */
    public void setUpdateBy(int UpdateBy) {
        this.UpdateBy = UpdateBy;
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
     * @return the defult
     */
    public int getDefult() {
        return defult;
    }

    /**
     * @param defult the defult to set
     */
    public void setDefult(int defult) {
        this.defult = defult;
    }

    @Override
    public String toString() {
        return "EmployeeGroup{" + "jobNo=" + jobNo + ", discription=" + discription + ", name=" + name + ", Createddate=" + Createddate + ", createdBy=" + createdBy + ", isactive=" + isactive + ", title=" + title + ", deleteYes=" + deleteYes + ", UpdateBy=" + UpdateBy + ", Updateddate=" + Updateddate + ", temp=" + temp + ", defult=" + defult + '}';
    }
            
            
    
    
    
}

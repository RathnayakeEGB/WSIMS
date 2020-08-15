
package bw.randiyadahara.wsims.model;


public class UsersRolsManagement {

    public UsersRolsManagement() {
    }
   
    
    private String userType;
    private String userName;
    private String PassWord;
    private String customer;
    private String cusGroup;
    private String empLoyee;
    private String empAttendence;
    private String empGroup;
    private String service;
    private String waterUsage;
    private String pumpInfo;
    private String Payment;
    private String invoice;
    private String report;
    private String about;
    private String priceList;
    private String userManage;
    private String createddate;
    private String isActive;
    private String createdBy;
    private String discription;
    private String deleteYestemp1;
    private String temp2;
    private int userId;
    private String subCommtee;
    private String fixCost;
    private String fullName;

    public UsersRolsManagement(String userType, String userName, String PassWord, String customer, String cusGroup, String empLoyee, String empAttendence, String empGroup, String service, String waterUsage, String pumpInfo, String Payment, String invoice, String report, String about, String priceList, String userManage, String createddate, String isActive, String createdBy, String discription, String deleteYestemp1, String temp2, int userId, String subCommtee, String fixCost, String fullName) {
        this.userType = userType;
        this.userName = userName;
        this.PassWord = PassWord;
        this.customer = customer;
        this.cusGroup = cusGroup;
        this.empLoyee = empLoyee;
        this.empAttendence = empAttendence;
        this.empGroup = empGroup;
        this.service = service;
        this.waterUsage = waterUsage;
        this.pumpInfo = pumpInfo;
        this.Payment = Payment;
        this.invoice = invoice;
        this.report = report;
        this.about = about;
        this.priceList = priceList;
        this.userManage = userManage;
        this.createddate = createddate;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.discription = discription;
        this.deleteYestemp1 = deleteYestemp1;
        this.temp2 = temp2;
        this.userId = userId;
        this.subCommtee = subCommtee;
        this.fixCost = fixCost;
        this.fullName = fullName;
    }

  

    
 
    
    public String getFname() {
        return getUserType();
    }

    /**
     * @param Fname the Fname to set
     */
    public void setFname(String Fname) {
        this.setUserType(Fname);
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the PassWord
     */
    public String getPassWord() {
        return PassWord;
    }

    /**
     * @param PassWord the PassWord to set
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the cusGroup
     */
    public String getCusGroup() {
        return cusGroup;
    }

    /**
     * @param cusGroup the cusGroup to set
     */
    public void setCusGroup(String cusGroup) {
        this.cusGroup = cusGroup;
    }

    /**
     * @return the empLoyee
     */
    public String getEmpLoyee() {
        return empLoyee;
    }

    /**
     * @param empLoyee the empLoyee to set
     */
    public void setEmpLoyee(String empLoyee) {
        this.empLoyee = empLoyee;
    }

    /**
     * @return the empAttendence
     */
    public String getEmpAttendence() {
        return empAttendence;
    }

    /**
     * @param empAttendence the empAttendence to set
     */
    public void setEmpAttendence(String empAttendence) {
        this.empAttendence = empAttendence;
    }

    /**
     * @return the empGroup
     */
    public String getEmpGroup() {
        return empGroup;
    }

    /**
     * @param empGroup the empGroup to set
     */
    public void setEmpGroup(String empGroup) {
        this.empGroup = empGroup;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the waterUsage
     */
    public String getWaterUsage() {
        return waterUsage;
    }

    /**
     * @param waterUsage the waterUsage to set
     */
    public void setWaterUsage(String waterUsage) {
        this.waterUsage = waterUsage;
    }

    /**
     * @return the pumpInfo
     */
    public String getPumpInfo() {
        return pumpInfo;
    }

    /**
     * @param pumpInfo the pumpInfo to set
     */
    public void setPumpInfo(String pumpInfo) {
        this.pumpInfo = pumpInfo;
    }

    /**
     * @return the Payment
     */
    public String getPayment() {
        return Payment;
    }

    /**
     * @param Payment the Payment to set
     */
    public void setPayment(String Payment) {
        this.Payment = Payment;
    }

    /**
     * @return the invoice
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the report
     */
    public String getReport() {
        return report;
    }

    /**
     * @param report the report to set
     */
    public void setReport(String report) {
        this.report = report;
    }

    /**
     * @return the about
     */
    public String getAbout() {
        return about;
    }

    /**
     * @param about the about to set
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return the priceList
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * @param priceList the priceList to set
     */
    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    /**
     * @return the userManage
     */
    public String getUserManage() {
        return userManage;
    }

    /**
     * @param userManage the userManage to set
     */
    public void setUserManage(String userManage) {
        this.userManage = userManage;
    }

    /**
     * @return the createddate
     */
    public String getCreateddate() {
        return createddate;
    }

    /**
     * @param createddate the createddate to set
     */
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
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
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
     * @return the deleteYestemp1
     */
    public String getDeleteYestemp1() {
        return deleteYestemp1;
    }

    /**
     * @param deleteYestemp1 the deleteYestemp1 to set
     */
    public void setDeleteYestemp1(String deleteYestemp1) {
        this.deleteYestemp1 = deleteYestemp1;
    }

    /**
     * @return the temp2
     */
    public String getTemp2() {
        return temp2;
    }

    /**
     * @param temp2 the temp2 to set
     */
    public void setTemp2(String temp2) {
        this.temp2 = temp2;
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

   
    public String getSubCommtee() {
        return subCommtee;
    }

    /**
     * @param subCommtee the subCommtee to set
     */
    public void setSubCommtee(String subCommtee) {
        this.subCommtee = subCommtee;
    }

    /**
     * @return the fixCost
     */
    public String getFixCost() {
        return fixCost;
    }

    /**
     * @param fixCost the fixCost to set
     */
    public void setFixCost(String fixCost) {
        this.fixCost = fixCost;
    }

   
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "UsersRolsManagement{" + "userType=" + userType + ", userName=" + userName + ", PassWord=" + PassWord + ", customer=" + customer + ", cusGroup=" + cusGroup + ", empLoyee=" + empLoyee + ", empAttendence=" + empAttendence + ", empGroup=" + empGroup + ", service=" + service + ", waterUsage=" + waterUsage + ", pumpInfo=" + pumpInfo + ", Payment=" + Payment + ", invoice=" + invoice + ", report=" + report + ", about=" + about + ", priceList=" + priceList + ", userManage=" + userManage + ", createddate=" + createddate + ", isActive=" + isActive + ", createdBy=" + createdBy + ", discription=" + discription + ", deleteYestemp1=" + deleteYestemp1 + ", temp2=" + temp2 + ", userId=" + userId + ", subCommtee=" + subCommtee + ", fixCost=" + fixCost + ", fullName=" + fullName + '}';
    }
    
    
    
}

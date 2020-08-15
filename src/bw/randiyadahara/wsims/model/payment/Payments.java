
package bw.randiyadahara.wsims.model.payment;

import java.sql.Date;
import java.sql.Timestamp;


public class Payments {
    
    private String isActive;
    private String deleteYes;
    private String voucherNo;
    private String customerName;
    private String cusNo;
    private String IsPaid;
    private String description;
    private float rmain;
    private float latecharge;
    private float resiveForPay;
    private float payment;
    private float balance;
    private float totalInvoiceCOst;
    private float customerOpenBalance;
    private float tem1;
    private float temp2;
    private int CreatedBY;
    private int UpdateBy;
    private java.sql.Date PaymentDate;
    private Timestamp createdDate;
    private Timestamp updateDate;
    private float remain;
    private float rs;
    private float change;

    public Payments() {
        
    }

    public Payments(String isActive, String deleteYes, String voucherNo, String customerName, String cusNo, String IsPaid, String description, float rmain, float latecharge, float resiveForPay, float payment, float balance, float totalInvoiceCOst, float customerOpenBalance, float tem1, float temp2, int CreatedBY, int UpdateBy, Date PaymentDate, Timestamp createdDate, Timestamp updateDate, float remain, float rs, float change) {
        this.isActive = isActive;
        this.deleteYes = deleteYes;
        this.voucherNo = voucherNo;
        this.customerName = customerName;
        this.cusNo = cusNo;
        this.IsPaid = IsPaid;
        this.description = description;
        this.rmain = rmain;
        this.latecharge = latecharge;
        this.resiveForPay = resiveForPay;
        this.payment = payment;
        this.balance = balance;
        this.totalInvoiceCOst = totalInvoiceCOst;
        this.customerOpenBalance = customerOpenBalance;
        this.tem1 = tem1;
        this.temp2 = temp2;
        this.CreatedBY = CreatedBY;
        this.UpdateBy = UpdateBy;
        this.PaymentDate = PaymentDate;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.remain = remain;
        this.rs = rs;
        this.change = change;
    }

   
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
     * @return the voucherNo
     */
    public String getVoucherNo() {
        return voucherNo;
    }

    /**
     * @param voucherNo the voucherNo to set
     */
    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
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
     * @return the IsPaid
     */
    public String getIsPaid() {
        return IsPaid;
    }

    /**
     * @param IsPaid the IsPaid to set
     */
    public void setIsPaid(String IsPaid) {
        this.IsPaid = IsPaid;
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
     * @return the rmain
     */
    public float getRmain() {
        return rmain;
    }

    /**
     * @param rmain the rmain to set
     */
    public void setRmain(float rmain) {
        this.rmain = rmain;
    }

    /**
     * @return the latecharge
     */
    public float getLatecharge() {
        return latecharge;
    }

    /**
     * @param latecharge the latecharge to set
     */
    public void setLatecharge(float latecharge) {
        this.latecharge = latecharge;
    }

    /**
     * @return the resiveForPay
     */
    public float getResiveForPay() {
        return resiveForPay;
    }

    /**
     * @param resiveForPay the resiveForPay to set
     */
    public void setResiveForPay(float resiveForPay) {
        this.resiveForPay = resiveForPay;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return the totalInvoiceCOst
     */
    public float getTotalInvoiceCOst() {
        return totalInvoiceCOst;
    }

    /**
     * @param totalInvoiceCOst the totalInvoiceCOst to set
     */
    public void setTotalInvoiceCOst(float totalInvoiceCOst) {
        this.totalInvoiceCOst = totalInvoiceCOst;
    }

    /**
     * @return the customerOpenBalance
     */
    public float getCustomerOpenBalance() {
        return customerOpenBalance;
    }

    /**
     * @param customerOpenBalance the customerOpenBalance to set
     */
    public void setCustomerOpenBalance(float customerOpenBalance) {
        this.customerOpenBalance = customerOpenBalance;
    }

    /**
     * @return the tem1
     */
    public float getTem1() {
        return tem1;
    }

    /**
     * @param tem1 the tem1 to set
     */
    public void setTem1(float tem1) {
        this.tem1 = tem1;
    }

    /**
     * @return the temp2
     */
    public float getTemp2() {
        return temp2;
    }

    /**
     * @param temp2 the temp2 to set
     */
    public void setTemp2(float temp2) {
        this.temp2 = temp2;
    }

    /**
     * @return the CreatedBY
     */
    public int getCreatedBY() {
        return CreatedBY;
    }

    /**
     * @param CreatedBY the CreatedBY to set
     */
    public void setCreatedBY(int CreatedBY) {
        this.CreatedBY = CreatedBY;
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
     * @return the PaymentDate
     */
    public java.sql.Date getPaymentDate() {
        return PaymentDate;
    }

    /**
     * @param PaymentDate the PaymentDate to set
     */
    public void setPaymentDate(java.sql.Date PaymentDate) {
        this.PaymentDate = PaymentDate;
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

   
    public float getRemain() {
        return remain;
    }

    /**
     * @param remain the remain to set
     */
    public void setRemain(float remain) {
        this.remain = remain;
    }

    
    public float getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(float rs) {
        this.rs = rs;
    }

    /**
     * @return the change
     */
    public float getChange() {
        return change;
    }

    /**
     * @param change the change to set
     */
    public void setChange(float change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Payments{" + "isActive=" + isActive + ", deleteYes=" + deleteYes + ", voucherNo=" + voucherNo + ", customerName=" + customerName + ", cusNo=" + cusNo + ", IsPaid=" + IsPaid + ", description=" + description + ", rmain=" + rmain + ", latecharge=" + latecharge + ", resiveForPay=" + resiveForPay + ", payment=" + payment + ", balance=" + balance + ", totalInvoiceCOst=" + totalInvoiceCOst + ", customerOpenBalance=" + customerOpenBalance + ", tem1=" + tem1 + ", temp2=" + temp2 + ", CreatedBY=" + CreatedBY + ", UpdateBy=" + UpdateBy + ", PaymentDate=" + PaymentDate + ", createdDate=" + createdDate + ", updateDate=" + updateDate + ", remain=" + remain + ", rs=" + rs + ", change=" + change + '}';
    }
   
    
    
}

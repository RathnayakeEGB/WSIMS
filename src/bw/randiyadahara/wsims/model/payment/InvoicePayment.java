
package bw.randiyadahara.wsims.model.payment;


 /*********** @author RATHNAYAKA*********/

public class InvoicePayment {
   
    private String isPaid;
    private String ISactive;
    private String DeleteYes;
    private String descriptin;
    private String invoiceNo;
    private String voucherNo;
    private float setOFfAmount;
    private float penaltyCost;
    private float totalcostForInvoice;
    private float df1;
    private float df2;
    private float lateChageRate;
    private int dueDate;
    private int year;
    private int month;
    private String lineNo;
    private String cusNo;

    public InvoicePayment() {
    }

    public InvoicePayment(String isPaid, String ISactive, String DeleteYes, String descriptin, String invoiceNo, String voucherNo, float setOFfAmount, float penaltyCost, float totalcostForInvoice, float df1, float df2, float lateChageRate, int dueDate, int year, int month, String lineNo, String cusNo) {
        this.isPaid = isPaid;
        this.ISactive = ISactive;
        this.DeleteYes = DeleteYes;
        this.descriptin = descriptin;
        this.invoiceNo = invoiceNo;
        this.voucherNo = voucherNo;
        this.setOFfAmount = setOFfAmount;
        this.penaltyCost = penaltyCost;
        this.totalcostForInvoice = totalcostForInvoice;
        this.df1 = df1;
        this.df2 = df2;
        this.lateChageRate = lateChageRate;
        this.dueDate = dueDate;
        this.year = year;
        this.month = month;
        this.lineNo = lineNo;
        this.cusNo = cusNo;
    }

   
   
    public String getIsPaid() {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * @return the ISactive
     */
    public String getISactive() {
        return ISactive;
    }

    /**
     * @param ISactive the ISactive to set
     */
    public void setISactive(String ISactive) {
        this.ISactive = ISactive;
    }

    /**
     * @return the DeleteYes
     */
    public String getDeleteYes() {
        return DeleteYes;
    }

    /**
     * @param DeleteYes the DeleteYes to set
     */
    public void setDeleteYes(String DeleteYes) {
        this.DeleteYes = DeleteYes;
    }

    /**
     * @return the descriptin
     */
    public String getDescriptin() {
        return descriptin;
    }

    /**
     * @param descriptin the descriptin to set
     */
    public void setDescriptin(String descriptin) {
        this.descriptin = descriptin;
    }

    /**
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * @param invoiceNo the invoiceNo to set
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
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
     * @return the setOFfAmount
     */
    public float getSetOFfAmount() {
        return setOFfAmount;
    }

    /**
     * @param setOFfAmount the setOFfAmount to set
     */
    public void setSetOFfAmount(float setOFfAmount) {
        this.setOFfAmount = setOFfAmount;
    }

    /**
     * @return the penaltyCost
     */
    public float getPenaltyCost() {
        return penaltyCost;
    }

    /**
     * @param penaltyCost the penaltyCost to set
     */
    public void setPenaltyCost(float penaltyCost) {
        this.penaltyCost = penaltyCost;
    }

    /**
     * @return the totalcostForInvoice
     */
    public float getTotalcostForInvoice() {
        return totalcostForInvoice;
    }

    /**
     * @param totalcostForInvoice the totalcostForInvoice to set
     */
    public void setTotalcostForInvoice(float totalcostForInvoice) {
        this.totalcostForInvoice = totalcostForInvoice;
    }

    /**
     * @return the df1
     */
    public float getDf1() {
        return df1;
    }

    /**
     * @param df1 the df1 to set
     */
    public void setDf1(float df1) {
        this.df1 = df1;
    }

    /**
     * @return the df2
     */
    public float getDf2() {
        return df2;
    }

    /**
     * @param df2 the df2 to set
     */
    public void setDf2(float df2) {
        this.df2 = df2;
    }

   

   
    public float getLateChageRate() {
        return lateChageRate;
    }

    /**
     * @param lateChageRate the lateChageRate to set
     */
    public void setLateChageRate(float lateChageRate) {
        this.lateChageRate = lateChageRate;
    }

    /**
     * @return the dueDate
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

   
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

   
    public String getLineNo() {
        return lineNo;
    }

    /**
     * @param lineNo the lineNo to set
     */
    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

  
    public String getCusNo() {
        return cusNo;
    }

    /**
     * @param cusNo the cusNo to set
     */
    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    @Override
    public String toString() {
        return "InvoicePayment{" + "isPaid=" + isPaid + ", ISactive=" + ISactive + ", DeleteYes=" + DeleteYes + ", descriptin=" + descriptin + ", invoiceNo=" + invoiceNo + ", voucherNo=" + voucherNo + ", setOFfAmount=" + setOFfAmount + ", penaltyCost=" + penaltyCost + ", totalcostForInvoice=" + totalcostForInvoice + ", df1=" + df1 + ", df2=" + df2 + ", lateChageRate=" + lateChageRate + ", dueDate=" + dueDate + ", year=" + year + ", month=" + month + ", lineNo=" + lineNo + ", cusNo=" + cusNo + '}';
    }
    
    
    
    
    
    
}

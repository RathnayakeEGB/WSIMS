
package bw.randiyadahara.wsims.model.invoice;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;


 // @author RATHNAYAKA

public class Invoices {

    public Invoices() {
    }
    
    private String InvoiceNo;
    private String cusNo;
    private String Name;
    private String isPaid;
    private String isActive;
    private String DeleteYeas;
    private String CusGroupNo;
    private String AdditionalSearvic;
    private String InvType;
    private String waterUsageNo;
    private float consumpUnites;
    private float fixCost;
    private float totalPrice;
    private float df1;
    private float df2;
    private int dueDate;
    private int createdBy;
    private int UpdateBY;
    private int Year;
    private int month;
    private int startUnits;
    private int EndUnits;
    private int temp1;
    private int temp2;
    private Timestamp createdDate;
    private Timestamp updateDate;
    private java.sql.Date invDate;
    private ArrayList<Float> PriceList;
    private float openBalance;
    private String Address ;
    private String cusGroupName;
    private int meterStrat;
    private int meterEnd;
    private java.sql.Date MterReadDate;
    private float billAmount;
    private float invAmount;
    private String description ;
    private String serviceYeas;

    public Invoices(String InvoiceNo, String cusNo, String Name, String isPaid, String isActive, String DeleteYeas, String CusGroupNo, String AdditionalSearvic, String InvType, String waterUsageNo, float consumpUnites, float fixCost, float totalPrice, float df1, float df2, int dueDate, int createdBy, int UpdateBY, int Year, int month, int startUnits, int EndUnits, int temp1, int temp2, Timestamp createdDate, Timestamp updateDate, Date invDate, ArrayList<Float> PriceList, float openBalance, String Address, String cusGroupName, int meterStrat, int meterEnd, Date MterReadDate, float billAmount, float invAmount, String description, String serviceYeas) {
        this.InvoiceNo = InvoiceNo;
        this.cusNo = cusNo;
        this.Name = Name;
        this.isPaid = isPaid;
        this.isActive = isActive;
        this.DeleteYeas = DeleteYeas;
        this.CusGroupNo = CusGroupNo;
        this.AdditionalSearvic = AdditionalSearvic;
        this.InvType = InvType;
        this.waterUsageNo = waterUsageNo;
        this.consumpUnites = consumpUnites;
        this.fixCost = fixCost;
        this.totalPrice = totalPrice;
        this.df1 = df1;
        this.df2 = df2;
        this.dueDate = dueDate;
        this.createdBy = createdBy;
        this.UpdateBY = UpdateBY;
        this.Year = Year;
        this.month = month;
        this.startUnits = startUnits;
        this.EndUnits = EndUnits;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.invDate = invDate;
        this.PriceList = PriceList;
        this.openBalance = openBalance;
        this.Address = Address;
        this.cusGroupName = cusGroupName;
        this.meterStrat = meterStrat;
        this.meterEnd = meterEnd;
        this.MterReadDate = MterReadDate;
        this.billAmount = billAmount;
        this.invAmount = invAmount;
        this.description = description;
        this.serviceYeas = serviceYeas;
    }
    
   
    public String getInvoiceNo() {
        return InvoiceNo;
    }

    /**
     * @param InvoiceNo the InvoiceNo to set
     */
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
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
     * @return the isPaid
     */
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
     * @return the DeleteYeas
     */
    public String getDeleteYeas() {
        return DeleteYeas;
    }

    /**
     * @param DeleteYeas the DeleteYeas to set
     */
    public void setDeleteYeas(String DeleteYeas) {
        this.DeleteYeas = DeleteYeas;
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
     * @return the AdditionalSearvic
     */
    public String getAdditionalSearvic() {
        return AdditionalSearvic;
    }

    /**
     * @param AdditionalSearvic the AdditionalSearvic to set
     */
    public void setAdditionalSearvic(String AdditionalSearvic) {
        this.AdditionalSearvic = AdditionalSearvic;
    }

    /**
     * @return the InvType
     */
    public String getInvType() {
        return InvType;
    }

    /**
     * @param InvType the InvType to set
     */
    public void setInvType(String InvType) {
        this.InvType = InvType;
    }

    /**
     * @return the waterUsageNo
     */
    public String getWaterUsageNo() {
        return waterUsageNo;
    }

    /**
     * @param waterUsageNo the waterUsageNo to set
     */
    public void setWaterUsageNo(String waterUsageNo) {
        this.waterUsageNo = waterUsageNo;
    }

    /**
     * @return the consumpUnites
     */
    public float getConsumpUnites() {
        return consumpUnites;
    }

    /**
     * @param consumpUnites the consumpUnites to set
     */
    public void setConsumpUnites(float consumpUnites) {
        this.consumpUnites = consumpUnites;
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
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
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
     * @return the UpdateBY
     */
    public int getUpdateBY() {
        return UpdateBY;
    }

    /**
     * @param UpdateBY the UpdateBY to set
     */
    public void setUpdateBY(int UpdateBY) {
        this.UpdateBY = UpdateBY;
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
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
     * @return the startUnits
     */
    public int getStartUnits() {
        return startUnits;
    }

    /**
     * @param startUnits the startUnits to set
     */
    public void setStartUnits(int startUnits) {
        this.startUnits = startUnits;
    }

    /**
     * @return the EndUnits
     */
    public int getEndUnits() {
        return EndUnits;
    }

    /**
     * @param EndUnits the EndUnits to set
     */
    public void setEndUnits(int EndUnits) {
        this.EndUnits = EndUnits;
    }

    /**
     * @return the temp1
     */
    public int getTemp1() {
        return temp1;
    }

    /**
     * @param temp1 the temp1 to set
     */
    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    /**
     * @return the temp2
     */
    public int getTemp2() {
        return temp2;
    }

    /**
     * @param temp2 the temp2 to set
     */
    public void setTemp2(int temp2) {
        this.temp2 = temp2;
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
     * @return the invDate
     */
    public java.sql.Date getInvDate() {
        return invDate;
    }

    /**
     * @param invDate the invDate to set
     */
    public void setInvDate(java.sql.Date invDate) {
        this.invDate = invDate;
    }

    /**
     * @return the PriceList
     */
    public ArrayList<Float> getPriceList() {
        return PriceList;
    }

    /**
     * @param PriceList the PriceList to set
     */
    public void setPriceList(ArrayList<Float> PriceList) {
        this.PriceList = PriceList;
    }

   
    public float getOpenBalance() {
        return openBalance;
    }

    /**
     * @param openBalance the openBalance to set
     */
    public void setOpenBalance(float openBalance) {
        this.openBalance = openBalance;
    }

  
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

   

  
    public String getCusGroupName() {
        return cusGroupName;
    }

    /**
     * @param cusGroupName the cusGroupName to set
     */
    public void setCusGroupName(String cusGroupName) {
        this.cusGroupName = cusGroupName;
    }

   
    public int getMeterStrat() {
        return meterStrat;
    }

    /**
     * @param meterStrat the meterStrat to set
     */
    public void setMeterStrat(int meterStrat) {
        this.meterStrat = meterStrat;
    }

    /**
     * @return the meterEnd
     */
    public int getMeterEnd() {
        return meterEnd;
    }

    /**
     * @param meterEnd the meterEnd to set
     */
    public void setMeterEnd(int meterEnd) {
        this.meterEnd = meterEnd;
    }

    public java.sql.Date getMterReadDate() {
        return MterReadDate;
    }

    /**
     * @param MterReadDate the MterReadDate to set
     */
    public void setMterReadDate(java.sql.Date MterReadDate) {
        this.MterReadDate = MterReadDate;
    }

 

    /**
     * @return the billAmount
     */
    public float getBillAmount() {
        return billAmount;
    }

    /**
     * @param billAmount the billAmount to set
     */
    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * @return the invAmount
     */
    public float getInvAmount() {
        return invAmount;
    }

    /**
     * @param invAmount the invAmount to set
     */
    public void setInvAmount(float invAmount) {
        this.invAmount = invAmount;
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
     * @return the serviceYeas
     */
    public String getServiceYeas() {
        return serviceYeas;
    }

    /**
     * @param serviceYeas the serviceYeas to set
     */
    public void setServiceYeas(String serviceYeas) {
        this.serviceYeas = serviceYeas;
    }

    @Override
    public String toString() {
        return "Invoices{" + "InvoiceNo=" + InvoiceNo + ", cusNo=" + cusNo + ", Name=" + Name + ", isPaid=" + isPaid + ", isActive=" + isActive + ", DeleteYeas=" + DeleteYeas + ", CusGroupNo=" + CusGroupNo + ", AdditionalSearvic=" + AdditionalSearvic + ", InvType=" + InvType + ", waterUsageNo=" + waterUsageNo + ", consumpUnites=" + consumpUnites + ", fixCost=" + fixCost + ", totalPrice=" + totalPrice + ", df1=" + df1 + ", df2=" + df2 + ", dueDate=" + dueDate + ", createdBy=" + createdBy + ", UpdateBY=" + UpdateBY + ", Year=" + Year + ", month=" + month + ", startUnits=" + startUnits + ", EndUnits=" + EndUnits + ", temp1=" + temp1 + ", temp2=" + temp2 + ", createdDate=" + createdDate + ", updateDate=" + updateDate + ", invDate=" + invDate + ", PriceList=" + PriceList + ", openBalance=" + openBalance + ", Address=" + Address + ", cusGroupName=" + cusGroupName + ", meterStrat=" + meterStrat + ", meterEnd=" + meterEnd + ", MterReadDate=" + MterReadDate + ", billAmount=" + billAmount + ", invAmount=" + invAmount + ", description=" + description + ", serviceYeas=" + serviceYeas + '}';
    }
    
    
}

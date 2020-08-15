
package bw.randiyadahara.wsims.model;

/**
 *
 * @author RATHNAYAKA
 */
public class CustomerGroupmatrixPriceList {

    public CustomerGroupmatrixPriceList() {
    }
   
    private int fromUnits; //price for One Unite
    private int toUnits;
    private float rate;
    private String name;
    private String LineNo;
    private String groupNo;
    private String mextrixPriceListNo;
    private String isActive;
    private String DeleteYes;

    public CustomerGroupmatrixPriceList(int fromUnits, int toUnits, float rate, String name, String LineNo, String groupNo, String mextrixPriceListNo, String isActive, String DeleteYes) {
        this.fromUnits = fromUnits;
        this.toUnits = toUnits;
        this.rate = rate;
        this.name = name;
        this.LineNo = LineNo;
        this.groupNo = groupNo;
        this.mextrixPriceListNo = mextrixPriceListNo;
        this.isActive = isActive;
        this.DeleteYes = DeleteYes;
    }
    
    

    /**
     * @return the fromUnits
     */
    public int getFromUnits() {
        return fromUnits;
    }

    /**
     * @param fromUnits the fromUnits to set
     */
    public void setFromUnits(int fromUnits) {
        this.fromUnits = fromUnits;
    }

    /**
     * @return the toUnits
     */
    public int getToUnits() {
        return toUnits;
    }

    /**
     * @param toUnits the toUnits to set
     */
    public void setToUnits(int toUnits) {
        this.toUnits = toUnits;
    }

    /**
     * @return the rate
     */
    public float getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(float rate) {
        this.rate = rate;
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
     * @return the LineNo
     */
    public String getLineNo() {
        return LineNo;
    }

    /**
     * @param LineNo the LineNo to set
     */
    public void setLineNo(String LineNo) {
        this.LineNo = LineNo;
    }

    /**
     * @return the groupNo
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo the groupNo to set
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return the mextrixPriceListNo
     */
    public String getMextrixPriceListNo() {
        return mextrixPriceListNo;
    }

    /**
     * @param mextrixPriceListNo the mextrixPriceListNo to set
     */
    public void setMextrixPriceListNo(String mextrixPriceListNo) {
        this.mextrixPriceListNo = mextrixPriceListNo;
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

    @Override
    public String toString() {
        return "CustomerGroupmatrixPriceList{" + "fromUnits=" + fromUnits + ", toUnits=" + toUnits + ", rate=" + rate + ", name=" + name + ", LineNo=" + LineNo + ", groupNo=" + groupNo + ", mextrixPriceListNo=" + mextrixPriceListNo + ", isActive=" + isActive + ", DeleteYes=" + DeleteYes + '}';
    }
    
    
    
}

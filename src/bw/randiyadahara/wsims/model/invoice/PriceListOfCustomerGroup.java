
package bw.randiyadahara.wsims.model.invoice;

/**
 *
 * @author RATHNAYAKA
 */
public class PriceListOfCustomerGroup {

    public PriceListOfCustomerGroup() {
    }
    
    private float rate;
    private String GroupNo;
    private String GroupType;
    private int fromUnits;
    private int Tounits;
    private int Temp1;

    public PriceListOfCustomerGroup(float rate, String GroupNo, String GroupType, int fromUnits, int Tounits, int Temp1) {
        this.rate = rate;
        this.GroupNo = GroupNo;
        this.GroupType = GroupType;
        this.fromUnits = fromUnits;
        this.Tounits = Tounits;
        this.Temp1 = Temp1;
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
     * @return the GroupNo
     */
    public String getGroupNo() {
        return GroupNo;
    }

    /**
     * @param GroupNo the GroupNo to set
     */
    public void setGroupNo(String GroupNo) {
        this.GroupNo = GroupNo;
    }

    /**
     * @return the GroupType
     */
    public String getGroupType() {
        return GroupType;
    }

    /**
     * @param GroupType the GroupType to set
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
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
     * @return the Tounits
     */
    public int getTounits() {
        return Tounits;
    }

    /**
     * @param Tounits the Tounits to set
     */
    public void setTounits(int Tounits) {
        this.Tounits = Tounits;
    }

    /**
     * @return the Temp1
     */
    public int getTemp1() {
        return Temp1;
    }

    /**
     * @param Temp1 the Temp1 to set
     */
    public void setTemp1(int Temp1) {
        this.Temp1 = Temp1;
    }

    @Override
    public String toString() {
        return "PriceListOfCustomerGroup{" + "rate=" + rate + ", GroupNo=" + GroupNo + ", GroupType=" + GroupType + ", fromUnits=" + fromUnits + ", Tounits=" + Tounits + ", Temp1=" + Temp1 + '}';
    }
    
    
}

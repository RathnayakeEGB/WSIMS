
package bw.randiyadahara.wsims.model.invoice;


public class InvoiceSearvice {

    public InvoiceSearvice() {
    }
    
    private String InvoiceLineNo;
    private String ServiceName;
    private String deletedYes;
    private String description;
    private String isActve;
    private String serviceNo;
    private float lineTotal;
    private float Price;
    private int qty;

    public InvoiceSearvice(String InvoiceLineNo, String ServiceName, String deletedYes, String description, String isActve, String serviceNo, float lineTotal, float Price, int qty) {
        this.InvoiceLineNo = InvoiceLineNo;
        this.ServiceName = ServiceName;
        this.deletedYes = deletedYes;
        this.description = description;
        this.isActve = isActve;
        this.serviceNo = serviceNo;
        this.lineTotal = lineTotal;
        this.Price = Price;
        this.qty = qty;
    }

    
    /**
     * @return the InvoiceLineNo
     */
    public String getInvoiceLineNo() {
        return InvoiceLineNo;
    }

    /**
     * @param InvoiceLineNo the InvoiceLineNo to set
     */
    public void setInvoiceLineNo(String InvoiceLineNo) {
        this.InvoiceLineNo = InvoiceLineNo;
    }

    /**
     * @return the ServiceName
     */
    public String getServiceName() {
        return ServiceName;
    }

    /**
     * @param ServiceName the ServiceName to set
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * @return the deletedYes
     */
    public String getDeletedYes() {
        return deletedYes;
    }

    /**
     * @param deletedYes the deletedYes to set
     */
    public void setDeletedYes(String deletedYes) {
        this.deletedYes = deletedYes;
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
     * @return the isActve
     */
    public String getIsActve() {
        return isActve;
    }

    /**
     * @param isActve the isActve to set
     */
    public void setIsActve(String isActve) {
        this.isActve = isActve;
    }

    /**
     * @return the serviceNo
     */
    public String getServiceNo() {
        return serviceNo;
    }

    /**
     * @param serviceNo the serviceNo to set
     */
    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    /**
     * @return the lineTotal
     */
    public float getLineTotal() {
        return lineTotal;
    }

    /**
     * @param lineTotal the lineTotal to set
     */
    public void setLineTotal(float lineTotal) {
        this.lineTotal = lineTotal;
    }

    /**
     * @return the Price
     */
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(float Price) {
        this.Price = Price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "InvoiceSearvice{" + "InvoiceLineNo=" + InvoiceLineNo + ", ServiceName=" + ServiceName + ", deletedYes=" + deletedYes + ", description=" + description + ", isActve=" + isActve + ", serviceNo=" + serviceNo + ", lineTotal=" + lineTotal + ", Price=" + Price + ", qty=" + qty + '}';
    }
    
    
    
    
}

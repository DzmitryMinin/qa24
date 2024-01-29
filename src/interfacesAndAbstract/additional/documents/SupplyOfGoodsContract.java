package interfacesAndAbstract.additional.documents;

import java.util.Date;

public class SupplyOfGoodsContract extends Document {
    private String goodType;
    private int goodQty;

    public SupplyOfGoodsContract() {

    }

    public SupplyOfGoodsContract(String documentNumber, Date documentDate, String goodType, int goodQty) {
        super(documentNumber, documentDate);
        this.goodType = goodType;
        this.goodQty = goodQty;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Document number: " + getDocumentNumber() + " Document date: " + getDocumentDate()
                + " Type of goods: " + this.goodType + " Quantity of goods: " + this.goodQty);
    }
}

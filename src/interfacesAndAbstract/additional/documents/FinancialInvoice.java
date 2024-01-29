package interfacesAndAbstract.additional.documents;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double finalSum;
    private String departmentCode;

    public FinancialInvoice() {

    }

    public FinancialInvoice(String documentNumber, Date documentDate, double finalSum, String departmentCode) {
        super(documentNumber, documentDate);
        this.finalSum = finalSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Document number: " + getDocumentNumber() + " Document date: " + getDocumentDate()
        + " Department code: " + this.departmentCode + " Final sum: " + this.finalSum);
    }
}

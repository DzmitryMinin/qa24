package interfacesAndAbstract.additional.documents;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document financialInvoice = new FinancialInvoice("100200", new Date(), 100, "QA24");
        Document supplyOfGoodsContract = new SupplyOfGoodsContract("100300", new Date(), "blabla", 10);
        Document employeeContract = new EmployeeContract("200300", new Date(), new Date(), "Dzmitry");

        Register register = new Register();
        register.addDocument(financialInvoice);
        register.getDocumentInfo(financialInvoice);

        register.addDocument(supplyOfGoodsContract);
        register.getDocumentInfo(supplyOfGoodsContract);

        register.addDocument(employeeContract);
        register.getDocumentInfo(employeeContract);
    }
}

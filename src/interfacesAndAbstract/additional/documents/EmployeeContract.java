package interfacesAndAbstract.additional.documents;

import java.util.Date;

public class EmployeeContract extends Document {
    private Date endDateContract;
    private String employee;

    public EmployeeContract() {

    }

    public EmployeeContract(String documentNumber, Date documentDate, Date endDateContract, String employee) {
        super(documentNumber, documentDate);
        this.endDateContract = endDateContract;
        this.employee = employee;
    }

    @Override
    public void showDocumentInfo() {
        System.out.println("Document number: " + getDocumentNumber() + " Document date: " + getDocumentDate()
                + " Contract end date: " + this.endDateContract + " Employee name: " + this.employee);
    }
}

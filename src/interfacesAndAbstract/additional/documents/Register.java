package interfacesAndAbstract.additional.documents;

public class Register {
    Document arrayDocument[] = new Document[10];
    private int i = 0;
    public void addDocument(Document document) {
        arrayDocument[i] = document;
        i++;
        System.out.println("Document has been added");
    }

    public void getDocumentInfo(Document document) {
        document.showDocumentInfo();
    }
}

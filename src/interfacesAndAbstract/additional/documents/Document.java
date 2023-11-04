package interfacesAndAbstract.additional.documents;

import java.util.Date;

/*1) Контракт на поставку товаров
Содержит поля:
- Номер документа
- Тип товаров
- Количество товаров
- Дата документа
2) Контракт с сотрудником
Содержит поля:
- Номер документа
- Дата документа
- Дата окончания контракта
- Имя сотрудника
3) Финансовая накладная
Содержит поля:
- Итоговая сумма за месяц
- Дата документа
- Номер документа
- Код департамента
Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр
этот добавляемый документ должен добавляться в массив; Массив для класса регистра должен быть размером 10;
Для полей "Дата документа" следует использовать тип данных Date; В методе предоставления информации
о документе следует выводить на экран информацию о переданном входным параметром документе;
Каждый класс для описания документов должен содержать конструктор с параметрами и без;*/

public abstract class Document {
    private String documentNumber;
    private Date documentDate;

    public Document() {

    }

    public Document(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public abstract void showDocumentInfo();

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }
}

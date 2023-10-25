package oopPrinciples.Main;
/*1. Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
возвращает номер телефона. Вызвать эти методы для каждого из
объектов. Добавить конструктор в класс Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight. Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model. Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот
метод. Создать метод sendMessage с аргументами переменной длины. Данный
метод принимает на вход номера телефонов, которым будет отправлено
сообщение. Метод выводит на консоль номера этих телефонов.*/

public class Main {
    public static void main(String[] args) {
        String number;
        Phone phone1 = new Phone("Iphone", "+375298009292", "190g");
        phone1.receiveCall("Dima");
        number = phone1.getNumber();
        phone1.receiveCall("Dima", "+375294232243");
        phone1.sendMessage("+37544223423", "+37529234234", "+375255343323");
        phone1.printOutData();

        Phone phone2 = new Phone("Samsung", "+3752352342", "200g");
        phone2.receiveCall("Alexei");
        number = phone2.getNumber();
        phone2.printOutData();

        Phone phone3 = new Phone("Sony", "+375298234234", "150g");
        phone3.receiveCall("Vova");
        phone3.getNumber();
        phone3.printOutData();
    }
}

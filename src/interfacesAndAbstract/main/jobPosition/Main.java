package interfacesAndAbstract.main.jobPosition;

/*2. Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные классы.*/

public class Main {
    public static void main(String[] args) {
        Position position = new Accountant();
        position.printPosition();
    }
}

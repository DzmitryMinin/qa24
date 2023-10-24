package classesAndObjects.Main.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("ALFA101222", 3000);
        card1.addMoney();
        card1.printInfo();

        CreditCard card2 = new CreditCard("PRIOR52243", 500);
        card2.addMoney();
        card2.printInfo();

        CreditCard card3 = new CreditCard("BSB3423422", 5000);
        card3.withdrawMoney();
        card3.printInfo();
    }
}

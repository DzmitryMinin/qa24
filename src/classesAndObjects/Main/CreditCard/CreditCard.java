package classesAndObjects.Main.CreditCard;

import java.util.Scanner;

public class CreditCard {
    String accountNumber;
    int accountBalance;

    public CreditCard(String accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void addMoney () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money you want to add: ");
        int sum = scanner.nextInt();
        accountBalance += sum;
    }
    public void withdrawMoney () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money you want to withdraw: ");
        int sum = scanner.nextInt();
        if (accountBalance > sum) {
            accountBalance -= sum;
        }
        else {
            System.out.println("You don't have enough money.");
        }
    }
    public void printInfo () {
        System.out.println("Account Number: " + accountNumber + "\n" + "Account Balance: " + accountBalance);
    }
}

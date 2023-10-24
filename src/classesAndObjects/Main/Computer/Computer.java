package classesAndObjects.Main.Computer;

import java.util.Scanner;

public class Computer {
    int price;
    String model;
    HDD HDD;
    RAM RAM;
    Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    Computer(int price, String model, HDD HDD, RAM RAM) {
        this.price = price;
        this.model = model;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    void printOutData() {
        System.out.println("Computer model is " + model + " and its price " + price);
    }
}

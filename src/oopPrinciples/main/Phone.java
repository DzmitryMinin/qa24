package oopPrinciples.main;

public class Phone {
    private String model;
    private String number;
    private String weight;
    private String name;

    public Phone(String model, String number, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void printOutData () {
        System.out.println("Model: " + model + "; Number: " + number + "; Weight: " + weight);
    }

    public void receiveCall (String name) {
        this.name = name;
        System.out.println("Incoming call from " + name);
    }
    public void receiveCall (String name, String number) {
        this.name = name;
        this.number = number;
        System.out.println("Incoming call from " + name + " " + number);
    }

    public void sendMessage(String... number) {
        System.out.println("Phone numbers: ");
        for (int i = 0; i < number.length; i ++) {
            System.out.println(number[i]);
        }
    }
    public String getNumber () {
        return this.number;
    }
}

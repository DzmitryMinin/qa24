package classesAndObjects.Main.Computer;

public class RAM {
    String name, volume;
    RAM() {

    }
    RAM(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printOutRAMData() {
        System.out.println("RAM name is " + name + " and its volume " + volume);
    }

    public void setRAMData() {
        name = "Corsair";
        volume = "32gb";
    }
}

package classesAndObjects.Main.Computer;

public class HDD {
    String name, volume;
    String type;
    HDD() {

    }
    HDD(String name, String volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printOutHDDData() {
        System.out.println("HDD name is " + name + " and its volume " + volume + " and type is " + type);
    }

    public void setHDDData() {
        name = "Sony";
        volume = "500gb";
        type = "external";
    }
}

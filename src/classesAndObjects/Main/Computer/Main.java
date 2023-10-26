package classesAndObjects.Main.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1200, "Intel i-7 7700", new HDD(), new RAM());
        computer1.printOutData();
        computer1.RAM.setRAMData();
        computer1.HDD.setHDDData();
        computer1.RAM.printOutRAMData();
        computer1.HDD.printOutHDDData();

        Computer computer2 = new Computer(1500, "Intel i-9 9000",
                new HDD("SATA", "300gb", "internal"), new RAM("Kingston", "16gb"));
        computer1.printOutData();
        computer1.RAM.printOutRAMData();
        computer1.HDD.printOutHDDData();
    }
}

package interfacesAndAbstract.main.jobPosition;

public class Accountant implements Position{
    private String position = "Accountant";
    @Override
    public void printPosition() {
        System.out.println(this.position);
    }
}

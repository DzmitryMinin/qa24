package interfacesAndAbstract.main.jobPosition;

public class Worker implements Position{
    private String position = "Worker";
    @Override
    public void printPosition() {
        System.out.println(this.position);
    }
}

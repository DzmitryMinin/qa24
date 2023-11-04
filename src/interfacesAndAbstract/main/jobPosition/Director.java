package interfacesAndAbstract.main.jobPosition;

public class Director implements Position{
    private String position = "Director";
    @Override
    public void printPosition() {
        System.out.println(this.position);
    }
}

package oopPrinciples.additional;

public class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Treatment plan: cut off hand");
    }
}

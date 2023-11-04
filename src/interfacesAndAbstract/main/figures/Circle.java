package interfacesAndAbstract.main.figures;

public class Circle extends Figure{
    private final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double getSquare() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public void printData() {
        System.out.println("Circle perimeter: " + getPerimeter() + " " + "Circle square: " + getSquare());
    }


}

package interfacesAndAbstract.main.figures;

public class Triangle extends Figure{
    private int c;

    public Triangle (int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public double semiPerimeter () {
        return getPerimeter() / 2;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(semiPerimeter() * (semiPerimeter()- getA()) * (semiPerimeter() - getB()) * semiPerimeter() - c);
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + c;
    }

    @Override
    public void printData() {
        System.out.println("Triangle perimeter: " + getPerimeter() + " " + "Triangle square: " + getSquare());
    }
}

package interfacesAndAbstract.main.figures;

public class Rectangle extends Figure{
    public Rectangle (int a, int b) {
        super(a, b);
    }

    @Override
    public double getSquare() {
        return getA() * getB();
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB()) * 2;
    }

    @Override
    public void printData() {
        System.out.println("Rectangle perimeter: " + getPerimeter() + " " + "Rectangle square: " + getSquare());
    }
}

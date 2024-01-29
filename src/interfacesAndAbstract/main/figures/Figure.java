package interfacesAndAbstract.main.figures;

public abstract class Figure {
    private int a, b;

    public Figure() {

    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public void printData() {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

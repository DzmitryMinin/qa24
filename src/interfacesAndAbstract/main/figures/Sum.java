package interfacesAndAbstract.main.figures;

public class Sum {
    private double sumPerimeter = 0;
    private double sumSquare = 0;

    public void getSumPerimeterAndSquare () {
        Figure array[] = new Figure[5];
        array[0] = new Circle(5);
        array[0].printData();
        array[1] = new Triangle(3, 4, 5);
        array[1].printData();
        array[2] = new Rectangle(3, 4);
        array[2].printData();
        array[3] = new Circle(10);
        array[3].printData();
        array[4] = new Triangle(5, 9, 6);
        array[4].printData();

        for (int i = 0; i < array.length; i ++) {
            sumPerimeter += array[i].getPerimeter();
            sumSquare += array[i].getSquare();
        }
    }

    public void printSumPerimeterAndSquare() {
        System.out.println("\nPerimeter sum of all the figures: " + sumPerimeter);
        System.out.println("Square sum of all the figures: " + sumSquare);
    }
}

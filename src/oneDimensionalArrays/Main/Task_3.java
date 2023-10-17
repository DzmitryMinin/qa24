package oneDimensionalArrays.Main;

/*2. Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        arraySize = scanner.nextInt();
        double array[] = new double[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println("Array is: " + Arrays.toString(array));

        double maxElement = array[0];
        double minElement = array[0];
        double avgValue = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                avgValue += array[i];
            }
            else if (array[i] < minElement) {
                minElement = array[i];
                avgValue += array[i];
            }
        }
        avgValue /= arraySize;
        System.out.println("Max element is: " + maxElement + "\nMin element is: " + minElement + "\nArithmetic mean is: " + avgValue);
    }
}

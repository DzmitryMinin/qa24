package oneDimensionalArrays.Additional;

/*5. Создайте массив и заполните массив. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.Снова выведете массив на экран на отдельной строке.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        arraySize = scanner.nextInt();

        int array[] = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array is: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Final array is: " + Arrays.toString(array));
    }
}

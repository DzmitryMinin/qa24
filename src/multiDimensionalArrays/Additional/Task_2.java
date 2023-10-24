package multiDimensionalArrays.Additional;

/* 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
элементов массива. */

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int sum = 0;
        size = scanner.nextInt();
        int array[][] = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Sum of all the elements is: " + sum);
    }
}

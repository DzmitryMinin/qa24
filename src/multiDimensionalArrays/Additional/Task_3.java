package multiDimensionalArrays.Additional;

/*4. Создайте двумерный массив. Выведите на консоль диагонали массива.*/

import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int sum = 0;
        size = scanner.nextInt();
        int array[][] = new int[size][size];

        //Fill in an array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        //Print out the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Left diagonal
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = -1;
                }
            }
        }

        //Right diagonal
        for (int i = array.length - 1; i >= 0; i--) {
            array[i][array.length - i - 1] = -1;
        }

        //Print out the result array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

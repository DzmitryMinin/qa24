package multiDimensionalArrays.Main;

/*0. Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
задается из консоли.*/

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int array[][][] = new int[3][3][3];
        int number;
        Random random = new Random();

        // Fill in the array with random numbers
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                }
            }
        }

        //Print the array
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to add to each element");
        number = scanner.nextInt();

        //Add a number to the element
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }

        //Print the result
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

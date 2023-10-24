package multiDimensionalArrays.Additional;

/*5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
двумерного массива по возрастанию.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0, m = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        int array[][] = new int[n][m];

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
            Arrays.sort(array[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

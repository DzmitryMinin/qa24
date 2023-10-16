package oneDimensionalArrays.Additional;

/*6. Создайте массив строк. Заполните его произвольными именами
людей. Отсортируйте массив. Результат выведите на консоль.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        arraySize = scanner.nextInt();

        String array[] = new String[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a name: ");
            array[i] = scanner.next();
        }
        Arrays.sort(array);
        System.out.println("Sorted array is: " + Arrays.toString(array));
    }
}

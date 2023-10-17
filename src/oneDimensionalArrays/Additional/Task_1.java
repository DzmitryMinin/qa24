package oneDimensionalArrays.Additional;

/*4. Создайте массив из n случайных целых чисел и выведите его на
экран. Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        arraySize = scanner.nextInt();
        while ((arraySize <= 5) | (arraySize > 10)) {
            System.out.println("Enter array size greater than 5 and less or equal 10: ");
            arraySize = scanner.nextInt();
        }

        int array[] = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.println("Array is: " + Arrays.toString(array));

        int notEvenQty = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 != 0) | (array[i] == 0)) {
                notEvenQty++;
            }
            else {
                array[i - notEvenQty] = array[i];
            }
        }

        int finalArray[] = Arrays.copyOf(array, array.length - notEvenQty);
        System.out.println("Array with even numbers: " + Arrays.toString(finalArray));
    }
}

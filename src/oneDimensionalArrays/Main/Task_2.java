package oneDimensionalArrays.Main;

/*1. Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        arraySize = scanner.nextInt();

        int array[] = new int [arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Initial array is: " + Arrays.toString(array));

        int number;
        System.out.println("Enter number you want to exclude: ");
        number = scanner.nextInt();

        int inNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                inNumber++;
            }
            else {
                array[i - inNumber] = array[i];
            }
        }

        if (inNumber == 0) {
            System.out.println("The number: " + number + " does not exist in the array");
        }

        int finalArray[] = Arrays.copyOf(array, array.length - inNumber);
        System.out.println("Final array is: " + Arrays.toString(finalArray));
    }
}

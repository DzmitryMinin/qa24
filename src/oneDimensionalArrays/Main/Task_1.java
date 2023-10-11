package oneDimensionalArrays.Main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 1. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).*/

public class Task_1 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println(number + " contains in the array");
            }
        }
    }
}

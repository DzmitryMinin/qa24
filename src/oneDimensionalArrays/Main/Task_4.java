package oneDimensionalArrays.Main;

/*3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).*/

import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int array1[] = new int [5];
        int array2[] = new int [5];

        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(5);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));

        double avgValueArray1 = 0;
        double avgValueArray2 = 0;
        for (int i = 0; i < array1.length; i++) {
            avgValueArray1 += array1[i];
        }
        avgValueArray1 /= array1.length;
        for (int i = 0; i < array2.length; i++) {
            avgValueArray2 += array2[i];
        }
        avgValueArray2 /= array2.length;
        if (avgValueArray1 > avgValueArray2) {
            System.out.println("Array1 average value is greater than Array2 and equal: " + avgValueArray1);
        } else if (avgValueArray1 < avgValueArray2) {
            System.out.println("Array2 average value is greater than Array1 and equal: " + avgValueArray2);
        } else if (avgValueArray1 == avgValueArray2) {
            System.out.println("Array1 average value and Array2 average value are equal: " + avgValueArray1);
        }
    }
}

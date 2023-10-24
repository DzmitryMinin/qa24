package multiDimensionalArrays.Additional;

/*2. Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0*/

public class Task_1 {
    public static void main(String[] args) {
        int array1[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int array2[][] = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int resultArray[][] = new int [3][3];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                resultArray[i][j] = 0;
                for (int k = 0; k < array1[0].length; k++) {
                    resultArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

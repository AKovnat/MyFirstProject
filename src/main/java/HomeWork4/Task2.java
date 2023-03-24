package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};

        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        System.out.println(Arrays.deepToString(arr1)+ " - первый массив");
        System.out.println(Arrays.deepToString(arr2)+ " - второй массив: ");


        int a = arr1.length;
        int b = arr2[0].length;
        int c = arr2.length;

        int[][] res = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];

                }

            }

        }
        System.out.println(Arrays.deepToString(res));
    }


}

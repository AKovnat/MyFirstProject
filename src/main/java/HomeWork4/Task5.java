package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] test = new int[3][3];


        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = random.nextInt(1, 10);

            }
        }
        System.out.println("Изначальный массив: " + Arrays.deepToString(test));
        for (int i = 0; i < test.length; i++) {
            Arrays.sort(test[i]);

        }
        System.out.println("Отсортированный массив: "+ Arrays.deepToString(test));

    }
}


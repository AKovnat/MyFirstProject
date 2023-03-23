package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] test = new int[3][3];
        int sum = 0;


        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = random.nextInt(1, 10);
                sum = sum + test[i][j];

            }
        }
        System.out.println(Arrays.deepToString(test));

        System.out.println("Сумма всех элементов массива равна: " + sum);


    }

}


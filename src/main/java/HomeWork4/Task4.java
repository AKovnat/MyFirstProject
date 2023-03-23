package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] test = new int[3][3];


        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = random.nextInt(1, 10);
            }
        }
        System.out.println(Arrays.deepToString(test));

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                if (i == j) {
                    System.out.print(test[i][j] + " ");


                }
            }


        }
        System.out.print("- элементы главной диагонали");
        System.out.println();
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                if ((i + j) == test.length - 1) {
                    System.out.print(test[i][j] + " ");

                }
            }

        }
        System.out.print("- элементы побочной диагонали");
    }
}



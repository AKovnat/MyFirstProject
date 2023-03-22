package HomeWork3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] test = new int[10];

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(1, 10);

        }
        System.out.print(Arrays.toString(test));
        System.out.println();
        for (int i = 0; i < test.length; i++) {

            if (i % 2 == 0) {
                test[i] = 0;

            }

        }
        System.out.println(Arrays.toString(test));
    }
}
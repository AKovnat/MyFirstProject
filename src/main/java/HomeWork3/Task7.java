package HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] test = new int[10];

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(test));
        System.out.println();

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < test.length - 1; i++) {
                if (test[i] > test[i + 1]) {
                    isSorted = false;

                    buf = test[i];
                    test[i] = test[i + 1];
                    test[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(test));
    }
}



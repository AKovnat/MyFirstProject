package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] test1 = new int[5];
        int[] test2 = new int[5];

        for (int i = 0; i < 5; i++) {
            test1[i] = random.nextInt(0, 10);
            test2[i] = random.nextInt(0, 10);


        }
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += (double) test1[i] / 5;
            average2 += (double) test2[i] / 5;
        }

        if (average1 > average1) {
            System.out.println("Среднее арифметическое первого массива " + average1 + " больше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое первого массива " + average1 + " меньше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else if (average1 == average2) {
            System.out.println("Средние арифметические массивов равны " + average1);
        }
    }
}




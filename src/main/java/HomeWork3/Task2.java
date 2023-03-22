package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] test;
        System.out.println("Введите размер массива: ");
        int j = scanner.nextInt();


        test = new int[j];

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(test));

        int max = test[0];
        int min = test[0];
        double average = 0;
        for (int i = 0; i < test.length; i++) {
            if (max < test[i])
                max = test[i];
            if (min > test[i])
                min = test[i];
            average += (float) test[i] / test.length;


        }
        System.out.println("Максимальное число массива  = " + max);
        System.out.println("Минимальное число массива = " + min);
        System.out.println("Среднее значение = " + average);
    }


}





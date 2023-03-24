package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите число: ");
        int x = scanner.nextInt();

        int[] test = new int[10];

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(10, 200);
        }

        boolean test2 = false;
        for (int i = 0; i < test.length; i++) {
            if (test[i] == x) {
                test2 = true;
                break;
            }

        }

        if (test2) {
            System.out.println("„исло входит в массив");
        } else {
            System.out.println("„исло не входит в массив");
        }
        System.out.println(Arrays.toString(test));
    }
}
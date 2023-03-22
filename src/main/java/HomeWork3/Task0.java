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


        boolean test1 = false;

        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(1, 10);
            if (test[i] == x) {
                test1 = true;
                System.out.println("„исло входит в массив");
                break;
            }

        }
        System.out.println(Arrays.toString(test));
    }


}



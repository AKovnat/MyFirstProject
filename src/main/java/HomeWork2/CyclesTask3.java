package HomeWork2;

import java.util.Scanner;


public class CyclesTask3 {
    public static void main(String[] args) {

        System.out.println("¬ведите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum = sum + i;


        }
        System.out.println(sum);


    }
}


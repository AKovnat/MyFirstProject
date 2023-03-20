package HomeWork2;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}

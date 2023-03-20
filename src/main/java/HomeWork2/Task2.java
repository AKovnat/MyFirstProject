package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");

        int x = scanner.nextInt();

        if (x == 12 || x == 1 || x == 2) {
            System.out.println("This is winter month");
        } else if (x == 3 || x == 4 || x == 5) {
            System.out.println("This is spring month");

        } else if (x == 6 || x == 7 || x == 8) {
            System.out.println("This is summer month");

        } else if (x == 9 || x == 10 || x == 11) {
            System.out.println("This is autumn month");

        } else {
            System.out.println("This month doesn't exist");
        }

    }


}


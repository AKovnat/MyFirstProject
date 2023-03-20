package HomeWork1;

import java.util.Scanner;

public class AddExr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int x = n / 100;
        int y = (n % 100) / 10;
        int z = (n % 100) % 10;
        System.out.println("Result = " + (x+y+z));
    }
}

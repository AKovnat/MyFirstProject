package HomeWork1;

import java.util.Scanner;

public class AddExr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of product A: ");
        int a = scanner.nextInt();
        System.out.println("Enter a discount for the product A: ");
        float c = scanner.nextFloat();
        System.out.println("Enter quantity of the product A: ");
        int d = scanner.nextInt();
        double x = a - a*c/100;
        System.out.println("Enter price of product B: ");
        int b = scanner.nextInt();
        System.out.println("Enter quantity of the product B: ");
        int f = scanner.nextInt();



        System.out.println("Total price: "+ (x*d+b*f));


    }
}

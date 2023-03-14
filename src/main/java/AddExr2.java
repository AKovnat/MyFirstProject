import java.util.Scanner;

public class AddExr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of product A: ");
        int A = scanner.nextInt();
        System.out.println("Enter price of product B: ");
        int B = scanner.nextInt();
        double C = A + B;
        double x = C - (C * 10 / 100);
        double D = C - x;
        System.out.println("Discounted price: " + x);
        System.out.println("Discount: " + D);
    }
}

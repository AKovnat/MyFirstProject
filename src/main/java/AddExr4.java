import java.util.Scanner;

public class AddExr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        double g = Math.sqrt(x*x+y*y);


        System.out.println("Result: " + g);
    }
}

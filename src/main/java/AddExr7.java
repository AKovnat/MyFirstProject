import java.util.Scanner;

public class AddExr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fractional number: ");

        float n = scanner.nextFloat();
        float y = Math.round(n);
        System.out.println("Result = " + y);
    }
}
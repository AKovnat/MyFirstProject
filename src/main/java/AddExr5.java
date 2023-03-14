import java.util.Scanner;
public class AddExr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q: ");
        int q = scanner.nextInt();
        System.out.println("Enter w: ");
        int w = scanner.nextInt();
        int x = q / w;
        int y = q % w;
        System.out.println(q + " / " + w + " = " + x + " & " + y );

    }
}

package HomeWork2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter month number: ");
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        switch (x) {
            case 1,2,12 -> System.out.println("This is winter month");
            case 3,4,5 -> System.out.println("This is spring month");
            case 6,7,8 -> System.out.println("This is summer month");
            case 9,10,11 -> System.out.println("This is autumn month");
            default -> System.out.println("This month doesn't exist");
        }


    }
}
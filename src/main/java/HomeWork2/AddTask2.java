package HomeWork2;
import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.println("¬ведите количество мес€цев: ");
        int months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            sum += sum * 0.07;


        }
        System.out.println("—умма вклада после " + months + " мес€цев составит "+ sum);
    }
}

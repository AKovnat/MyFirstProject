package HomeWork2;
import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������: ");
        float sum = scanner.nextFloat();
        System.out.println("������� ���������� �������: ");
        int months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            sum += sum * 0.07;


        }
        System.out.println("����� ������ ����� " + months + " ������� �������� "+ sum);
    }
}

package HomeWork2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("������� ����������� �� �����: ");
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("�����");
        } else if (t <=-5 && t > -20) {
            System.out.println("���������");

        } else if (t <= -20) {
            System.out.println("�������");


        }
    }
}

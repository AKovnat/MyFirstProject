package HomeWork2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("������� ����� �� 1 �� 7: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("�������");
            case 2 -> System.out.println("���������");
            case 3 -> System.out.println("������");
            case 4 -> System.out.println("�������");
            case 5 -> System.out.println("�������");
            case 6 -> System.out.println("�����");
            case 7 -> System.out.println("����������");
            default -> System.out.println("������� �������� �����!");
        }
    }
}

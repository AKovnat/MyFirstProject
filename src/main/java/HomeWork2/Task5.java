package HomeWork2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 7: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("Введено неверное число!");
        }
    }
}

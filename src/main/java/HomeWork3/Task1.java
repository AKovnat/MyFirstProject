package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {9, 6, 4, 3, 2, 11, 4, 7, 8, 0};
        int[] newArray = new int[10];

        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == x) {
                newArray = new int[array.length - 1];
                for (int j = 0; j < i; j++) {
                    newArray[j] = array[j];
                }
                for (int k = i; k < array.length - 1; k++) {
                    newArray[k] = array[k + 1];
                }
                break;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(newArray));
    }
}


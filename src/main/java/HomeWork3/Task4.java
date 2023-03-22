package HomeWork3;


import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n < 5 || n >= 10) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 5 || n >= 10) {
                    System.out.println("Введено неверное число. Повторите ввод: ");
                }

            }
        }
        int[] array1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(0, 100);
            if (array1[i] % 2 == 0) {
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}


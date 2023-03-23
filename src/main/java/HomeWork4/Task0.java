package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][][] test = new int[2][2][2];


        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    test[i][j][k] = random.nextInt(1, 10);


                }
            }

        }
        System.out.println("Иcходный массив: " + Arrays.deepToString(test));
        System.out.print("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    test[i][j][k] += x;

                }

            }
        }
        System.out.println("Получившийся массив: " + Arrays.deepToString(test));
    }
}

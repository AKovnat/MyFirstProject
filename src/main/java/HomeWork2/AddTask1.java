package HomeWork2;

public class AddTask1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }
}

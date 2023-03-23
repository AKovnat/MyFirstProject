package HomeWork4;

public class Task1 {
    public static void main(String[] args) {

        String[][] arr = new String[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W" + "  ");
                } else {
                    System.out.print("B" + "  ");
                }

            }
            System.out.println();

        }
    }
}

package HomeWork3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String[] names = new String[6];

        names[0] = "����";
        names[1] = "�����";
        names[2] = "������";
        names[3] = "����";
        names[4] = "���";
        names[5] = "�����";

        System.out.print(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println();
        System.out.print(Arrays.toString(names));
    }

}
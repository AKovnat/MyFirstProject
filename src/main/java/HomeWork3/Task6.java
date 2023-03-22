package HomeWork3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String[] names = new String[6];

        names[0] = "Карл";
        names[1] = "Фрэнк";
        names[2] = "Мэлвин";
        names[3] = "Лэнс";
        names[4] = "Шон";
        names[5] = "Майкл";

        System.out.print(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println();
        System.out.print(Arrays.toString(names));
    }

}
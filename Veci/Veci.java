package Veci;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Veci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new StringBuilder(sc.nextLine()).reverse().toString();
        ArrayList<String> list = new ArrayList<String>();

        int index_i = -1;
        int index_j = -1;
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) > s.charAt(j)) {

                    index_i = i;
                    index_j = j;
                    b = true;
                    break;

                }

            }
            if (b)
                break;

        }
        if (b) {
            for (int i = 0; i < index_j + 1; i++) {
                if (i != index_i)
                    list.add("" + s.charAt(i));
            }
            Collections.sort(list);
            String result = "";
            for (int i = list.size() - 1; i >= 0; i--)
                result += list.get(i);
            result += s.charAt(index_i) + s.substring(index_j + 1);
            System.out.println(new StringBuilder(result).reverse().toString());

        } else {
            System.out.println("0");
        }

    }
}

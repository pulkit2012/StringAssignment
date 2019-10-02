package quesseight;

import java.util.Scanner;

public class Quesseight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a = in.nextLine().trim();
        String b = a.toUpperCase();
        int x = 0;
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int d = c;
            x = x + d;

            System.out.println(d);

        }
        System.out.println("total UpperWeight of this string is " + x);
    }
}
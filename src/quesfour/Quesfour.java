package quesfour;

import java.util.Scanner;

public class Quesfour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string\n");
        String a = in.nextLine().trim();
        a = a.replaceFirst("[aeiouAEIOU]", "*");
        a = a.replaceFirst("[aeiouAEIOU]", "^");
        a = a.replaceFirst("[aeiouAEIOU]", "!");
        System.out.println(a);
    }
}
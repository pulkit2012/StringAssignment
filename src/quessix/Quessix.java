package quessix;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Quessix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a = in.nextLine().trim();
        System.out.println(a.toUpperCase());
    }
}
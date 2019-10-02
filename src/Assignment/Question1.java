package Assignment;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of string\n");
        String a = in.nextLine().trim();
        StringBuffer b = new StringBuffer("chars:\t");
        StringBuffer c = new StringBuffer("index:\t");
        for (int i = 0; i < a.length(); i++) {
            b.append(a.charAt(i) + "\t");
            c.append(i + "\t");


        }
        System.out.println(c);
        System.out.println(b);

    }
}

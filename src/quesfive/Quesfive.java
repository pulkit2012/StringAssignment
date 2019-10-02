package quesfive;
import java.util.Scanner;
public class Quesfive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a = in.nextLine().trim();
        System.out.println("enter the substring");
        String b = in.nextLine().trim();
        a = a.replaceAll(b,"*");
        System.out.println(a);
    }
}

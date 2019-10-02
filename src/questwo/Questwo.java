package questwo;
import java.util.Scanner;
public class Questwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a = in.nextLine().trim();
        System.out.println("enter the index");
        int b = in.nextInt();
        System.out.println(a.substring(b));
    }

}

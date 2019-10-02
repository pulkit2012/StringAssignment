package queseleven;
import java.util.Scanner;
public class Queseleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a = in.nextLine().trim();
        System.out.println("enter the character");
        char b = in.next().charAt(0);
        int index = a.indexOf(b);
        for(int i =0;i< a.length();i++ ){
            if(a.charAt(i) == b){
                System.out.println(i);
            }

        }

    }
}

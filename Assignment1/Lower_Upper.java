import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int a = (int)(n);
        if (a>=97 && n<=122){
            System.out.print("lowercase");
        }
        else if (a>=65 && a<=90){
            System.out.print("UPPERCASE");
        }
        else {
            System.out.print("Invalid");
        }
    }
}

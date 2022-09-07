import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int div, rem, divi;
        // if (n1 > n2) {
        // div = n2;
        // divi = n1;
        // } else {
        // div = n1;
        // divi = n2;
        // }
        div = n1;
        divi = n2;
        while ((divi % div) != 0) {
            rem = divi % div;
            divi = div;
            div = rem;
        }
        System.out.print(div);
        sc.close();
    }
}

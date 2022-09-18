import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int dif = sc.nextInt();
        int i = min;
        double C=0.0;

        while(i<=max){
            // C = ((5/9)*(i-32));
            C = (5.0/9)*(i-32);
            int c=(int)(C);
            System.out.print(i+"    ");
            System.out.println(c);
            i = i + dif;
        }
    }
}

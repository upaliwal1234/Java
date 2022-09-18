import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem,div=n1,divi=n2;
        while((divi%div)!=0){
            rem=divi%div;
            divi=div;
            div=rem;
        }
        System.out.print(div);
    }
}

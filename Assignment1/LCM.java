import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = n1;
        if(n2>n1){
            x=n2;
        }

        for(int i = x;i<=n1*n2;i++){
            if(i%n2==0 && i%n1==0){
                System.out.print(i);
                break;
            }
        }
    }
}

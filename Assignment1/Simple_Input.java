import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int s=0;
        while(s>=0){
            int n = sc.nextInt();
            s=s+n;
            if(s>=0){
                System.out.println(n);
            }
            
        }
    }
}

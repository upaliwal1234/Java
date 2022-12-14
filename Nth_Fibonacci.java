import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        System.out.print(nth_fibonacci(t));
    }
    public static int nth_fibonacci(int t){
        if(t == 1){
            return 0;
        }
        int x = -1;
        int y = 1;
        int s = 0;
        while(t>=0){
            s = x+y;
            x = y;
            y = s;
            t--;
        }
        return s;
    }
}

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag = 0;
                break;
            }
        }
        if(flag==1){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}

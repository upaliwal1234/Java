import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i=1;
        int j=1;
        while(i<=n1){
            if((3*j+2)%n2!=0){
                System.out.println(3*j+2);
                i++;
            }
            j++;
        }
    }
}

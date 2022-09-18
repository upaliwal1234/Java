import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = b*b - 4*a*c;
        if (d>0 || d==0){
            if(d>0){
                System.out.println("Real and Distinct");
            }
            else if (d==0){
                System.out.println("Real and Equal");
            }
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            int x = (int)x1;
            int y = (int)x2;
            if(x1>x2){
                x = (int)(x2);
                y = (int)x1;
            }

            System.out.print(x+" "+y);

        }
        else{
            System.out.print("Imaginary");
        }
        sc.close();
    }
}

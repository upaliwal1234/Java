// Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 
// 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan21 = new Scanner(System.in);
        int num = scan21.nextInt();
        System.out.print(nth_triangle(num));
    }
    public static int nth_triangle(int num){
        if(num == 1){
            return 1;
        }
        return num + nth_triangle(num-1);
    }
}

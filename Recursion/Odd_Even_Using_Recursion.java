// Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion
// Sample Input: 5
// Sample Output: 5
//                3
//                1
//                2
//                4

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

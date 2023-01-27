// Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and
// even numbers in increasing sequence (up until N) using Recursion
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int num = scan21.nextInt();
        print_odd(num);
        print_even(num);
    }
    public static void print_odd(int num){
        if(num<1){
            return;
        }
        if(num%2 != 0){
            System.out.println(num);
        }
        print_odd(num-1);
    }
    public static void print_even(int num){
        if(num <= 0){
            return;
        }
        print_even(num - 1);
        if(num%2 == 0){
            System.out.println(num);
        }
    }
}

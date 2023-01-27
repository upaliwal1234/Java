// Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal.
// The rules of the game are as follows:
// Initially, there is an array, A , containing 'N' integers.
// In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal
// to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.
// After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
// the remaining partition as array 'A'.
// Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int t = scan21.nextInt();
        while(t-- > 0){
            int n = scan21.nextInt();
            int[] rra = new int[n];
            for(int i = 0; i<rra.length; i++){
                rra[i] = scan21.nextInt();
            }
            System.out.println(ArrayGame(rra, 0, n-1));
        }
    }
    public static int ArrayGame(int[]arr, int initial, int last){
        for(int mid = initial; mid < last; mid++){
            int sum_1 = 0;
            for(int i = initial; i<= mid; i++){
                sum_1 += arr[i];
            }
            int sum_2 = 0;
            for(int i = mid + 1; i <= last; i++){
                sum_2 += arr[i];
            }
            if(sum_1 == sum_2){
                int left = ArrayGame(arr, initial, mid);
                int right = ArrayGame(arr, mid + 1, last);
                return Math.max(left, right) + 1;
            }
        }
       return 0;
    }
}

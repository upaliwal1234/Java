import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]A = new int[n];
        for(int i =0; i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.print(negative_subarray(A));
    }
    public static int negative_subarray(int[] arr){
        int count=0;
        for(int len = 0; len<arr.length;len++){
            for(int j = len;j<arr.length;j++){
                int i = j-len;
                if(sum(arr,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean sum(int[] arr, int i, int j){
        int sum = 0;
        for(int k = i; k<=j;k++){
            sum+=arr[k];
        }
        if(sum<0){
            return true;
        }
        else{
            return false;
        }
    }
}

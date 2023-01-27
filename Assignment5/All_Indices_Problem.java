// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
// Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. 
// Print all the values in the returned array.


import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int[] rra = new int[n];
        for(int l = 0 ; l<rra.length; l++){
            rra[l] = scan21.nextInt();
        }
        int t = scan21.nextInt();
        indexes(rra, t, 0);
    }
    public static void indexes(int[] rra, int t, int x){
        if(x==rra.length){
            return;
        }
        if(rra[x] == t){
            System.out.print(x+" ");
        }
        indexes(rra, t, x+1);
    }
}

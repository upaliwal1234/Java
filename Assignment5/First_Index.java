// Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input M, a number. Write a recursive function which returns the first index at which M is found in the array 
// and -1 if M is not found anywhere. Print the value returned.


import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int[] rra = new int[n];
        for(int l = 0; l<rra.length; l++){
            rra[l] = scan21.nextInt();
        }
        int m = scan21.nextInt();
        System.out.print(first_occur(rra, m, 0));
    }
    public static int first_occur(int[] rra, int t, int z){
        if(z==rra.length){
            return -1;
        }
        if(rra[z]==t){
            return z;
        }
        return first_occur(rra, t, z+1);
    }
}

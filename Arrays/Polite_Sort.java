// Polite Sort

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] rra = new int[l];
        for(int k = 0; k<rra.length;k++){
            rra[k] = scan.nextInt();
        }
        System.out.print(polite_sort(rra));
    }
    public static int polite_sort(int[] rra){
        boolean[] sorted = new boolean[rra.length];
        int[] A = new int[rra.length];
        for(int l = 0; l<rra.length;l++){
            A[l] = rra[l];
        }
        Arrays.sort(A);
        for(int i = 0;i<A.length;i++){
            if(A[i] == rra[i]){
                sorted[i] = true;
            }
            else{
                sorted[i] = false;
            }
        }
        int start = -1;
        int end = -1;
        int i = 0;
        int j = rra.length-1;
        while(i<rra.length){
            if(sorted[i] == false){
                start = i;
                break;
            }
            i++;
        }
        while(j>=0){
            if(sorted[j] == false){
                end = j;
                break;
            }
            j--;
        }
        if(start==-1 && end ==-1){
            return 0;
        }
        return end-start+1;
    }
}

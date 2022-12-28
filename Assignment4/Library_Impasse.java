// Monu Bhaiya is in a library. He approaches a shelf which has N books and each book has some amount of perks. 
// Monu Bhaiya randomly chooses any book and decides to read all the books on its left or all the books on its right, 
// depending on which side has minimum perks for all the books combined.
// However, he reaches an impasse, if the perks for all the books together on either side are equal.
// You are given an array A, of size N. Ai denotes the perk of a book. Print the index of the book for which Monu Bhaiya reaches an impasse.
// Note: If there is no such index, then print “-1” and if there are multiple indices, print the leftmost index.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] Z = new int[t];
        for(int l = 0;l<t;l++){
            Z[l] = scan.nextInt();
        }
        System.out.print(index(Z));
    }
    public static int index(int[] rra){
        int[] rra1 = new int[rra.length];
        int[] rra2 = new int[rra.length];
        rra1[0] = rra[0];
        rra2[rra2.length-1] = rra[rra.length-1];
        for(int k = 1;k<rra1.length;k++){
            rra1[k] = rra1[k-1]+rra[k];
        }
        for(int k = rra2.length-2;k>=0;k--){
            rra2[k] = rra2[k+1]+rra[k];
        }
        for(int i = 0; i<rra.length;i++){
            if(rra1[i]==rra2[i]){
                return i;
            }
        }
        return -1;
    }
}

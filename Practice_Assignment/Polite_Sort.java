// Polite Sort
// Dima has been assigned the task of arranging the books as per their identification number (an integer) on a shelf. She is very exhausted, 
// so she asks one of her friends for help. Being polite she will only ask him to sort the shortest part (continuous) of the shelf such that if he only sorts
// all the books in that part, the whole shelf is sorted.
// You are given an array A, of size N, where each element denotes the ID of the book on the shelf at that position. 
// Find the minimum length of the shelf that Dima would ask his friend to sort to complete her task.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] array = new int[t];
        for(int i = 0; i<t; i++){
            array[i] = scan.nextInt();
        }
        System.out.print(polite_sort(array));
    }
    public static int polite_sort(int[] arr){
        int[] rra = new int[arr.length];
        for(int i = 0; i<rra.length; i++){
            rra[i] = arr[i];
        }
        Arrays.sort(rra);
        int start = -1;
        int end = -1;
        int i = 0;
        int j = arr.length-1;
        while(i<arr.length){
            if(arr[i] != rra[i]){
                start = i;
                break;
            }
            i++;
        }
        while(j>=0){
            if(arr[j] != rra[j]){
                end = j;
                break;
            }
            j--;
        }
        if(start==-1 && end==-1){
            return 0;
        }
        return end-start+1;
    }
}

// Mili has recently been assigned to get an old Art Gallery up and running. She was looking around for improvements needed to be done and found out there 
// a too few paintings and artifacts. She wishes to add K more articles to the Gallery. However, for a better view, she wouldn’t place any two articles adjacently.
// You are provided with an array A, of size N containing 0’s and 1’s representing the presence of an article the wall, where 0 means the spot is empty 
// and 1 means the spot already has an article. Will Mili be able to add K more article without any two of them being placed adjacent.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] Z = new int[t];
        for(int i = 0;i<t;i++){
            Z[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        System.out.print(gallery(Z,k));
    }
    public static boolean gallery(int[] rra, int k){
        int cout = 0;
        for(int i = 0; i<rra.length; i++){
            if(i==0 && rra[i]==0 && rra[i+1]==0){
                rra[i]=1;
                cout++;
            }
            else if(i==rra.length-1 && rra[i]==0 && rra[i-1]==0){
                rra[i]=1;
                cout++;
            }
            else if(i!=0 && i!=rra.length-1 && rra[i-1]==0 && rra[i]==0 && rra[i+1]==0){
                rra[i] = 1;
                cout++;
            }
        }
        if(cout<k){
            return false;
        }
        else{
            return true;
        }
    }
}

// In MATLAB, there is a handy function called reshape which can reshape an M × N matrix into a new one with a different size R × C keeping its original data.
// You are given an M × N matrix MAT and two integers R and C representing the number of rows and the number of columns of the wanted reshaped matrix. 
// The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
// NOTE: If the reshape isn’t possible print the original matrix.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(m*n!=r*c){
            for(int i = 0; i<arr.length;i++){
                for(int j = 0; j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            int[][] brr = new int[r][c];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    list.add(arr[i][j]);
                }
            }
            int count = 0;
            for(int i = 0;i<brr.length;i++){
                for(int j = 0;j<brr[0].length;j++){
                    brr[i][j] = list.get(count);
                    count++;
                }
            }
            for(int i = 0; i<brr.length;i++){
                for(int j = 0; j<brr[0].length;j++){
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
}

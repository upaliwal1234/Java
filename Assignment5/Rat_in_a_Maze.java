// You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
// Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, rat can reach this position. 
// A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).
import java.util.*;
public class Main {
    static boolean flag = false;
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int m = scan21.nextInt();
        char[][] rra = new char[n][m];
        for(int p = 0; p < rra.length; p++){
            String str = scan21.next();
            for(int q = 0; q < rra[0].length; q++){
                rra[p][q] = str.charAt(q);
            }
        }
        int[][] arr = new int[n][m];
        path(rra, 0, 0, n, m, arr);
        if(flag == false){
            System.out.print(-1);
        }
    }
    public static void path(char[][] rra, int curr_i, int curr_j, int n, int m, int[][] arr){
        if(flag == true){
            return;
        }
        if(curr_i == n-1 && curr_j == m-1){
            flag = true;
            arr[curr_i][curr_j] = 1;
            Display(arr);
            return;
        }
        if(curr_i < 0 || curr_j < 0 || curr_i >= n || curr_j >= m || rra[curr_i][curr_j] == 'X'){
            return;
        }
        rra[curr_i][curr_j] = 'X';
        arr[curr_i][curr_j] = 1;
        path(rra, curr_i, curr_j + 1, n, m, arr); //right
        path(rra, curr_i + 1, curr_j, n, m, arr); //down
        rra[curr_i][curr_j] = 'O';
        arr[curr_i][curr_j] = 0;
    }
    public static void Display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

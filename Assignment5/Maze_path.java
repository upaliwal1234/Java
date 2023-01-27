// Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. 
// Our player starts in top-left corner of the board and must reach bottom-right corner. 
// In one move the player can move 1 step horizontally (right) or 1 step vertically (down).
// a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
// b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.
// e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. 
// Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
// Input Format
// Enter the number of rows N and columns M

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int x = scan21.nextInt();
        int y = scan21.nextInt();
        int[][] arr = new int[x][y];
        System.out.print("\n"+ Path(arr, 0, 0, ""));
    }

    public static int Path(int[][] arr, int m, int n, String ans) {
        if (m == arr.length - 1 && n == arr[0].length - 1) {
            System.out.print(ans + " ");
            return 1;
        }
        if (m > arr.length - 1 || n > arr[0].length - 1) {
            return 0;
        }
        int a = Path(arr, m + 1, n, ans + "V");
        int b = Path(arr, m, n + 1, ans + "H");
        return a+b;
    }
}

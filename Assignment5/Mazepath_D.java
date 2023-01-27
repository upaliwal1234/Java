// Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board.
// Our player starts in top-left corner of the board and must reach bottom-right corner. 
// In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).
// Write a recursive function which:
// a. Returns the count of different ways the player can travel across the board. Print the value returned.
// b. Prints moves for all valid paths across the board.
// Input Format
// Enter the number of rows N1 and number of columns N2

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
        int c = Path(arr, m+1, n+1, ans + "D");
        return a+b+c;
    }
}

// Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner.
// The piece moves as follows –
// a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid 
// i.e. both row and column must increase in a move.
// b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves).
// But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.
// c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves).
// But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.
// You are supposed to write the following functions
// a. Write a recursive function which prints all valid paths.
// b. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        System.out.println("\n"+ Problem_Chessboard(n, 0, 0, "{0-0}"));
    }
    public static int Problem_Chessboard(int n, int r, int c, String sna12){
        if(n == 0){
            System.out.print("{0-0}");
            return 1;
        }
        if(r == n-1 && c == n-1){
            System.out.print(sna12 + " ");
            return 1;
        }
        if(r >= n || c >= n){
            return 0;
        }
        int x = night_player(n, r, c, sna12);
        int y = book_player(n, r, c, sna12);
        int z = shop_321(n, r, c, sna12);
        return x + y + z;
    }
    public static int shop_321(int n, int r,int c,String sna12){
        sna12 = sna12+ "B";
		int p123 = 0;
		if(r == c ||(r+c == n-1)) {
			for(int i=1; i<n; i++)
				p123+=Problem_Chessboard(n, r+i, c+i, sna12+String.format("{%d-%d}",r+i,c+i));
		}
		return p123;
    }
    public static int book_player(int n , int r, int c, String sna12){
        sna12 = sna12 + "R";
		int p123=0;
		if(r==0 || r==n-1 || c==0 || c==n-1) {
			for(int i=1; i<n; i++)
				p123 += Problem_Chessboard(n,r,c+i,sna12+String.format("{%d-%d}", r, c+i));
			for(int i=1;i<n;i++)
				p123 += Problem_Chessboard(n,r+i,c,sna12+String.format("{%d-%d}", r+i, c));
		}
		return p123;
    }
    public static int night_player(int n,int r, int c, String sna12){
        sna12 = sna12 + "K" ;
        int b = Problem_Chessboard(n, r+2, c+1, sna12+String.format("{%d-%d}",r+2,c+1));
        int a = Problem_Chessboard(n, r+1, c+2, sna12+String.format("{%d-%d}",r+1,c+2));
        return a + b;
    }
}

// Write a program to solve a Sudoku puzzle by filling the empty cells.
// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.<br.

import java.util.*;
public class Main {
	public static void main(String args[]){
        Scanner rubix_scanner = new Scanner(System.in);
        int num = rubix_scanner.nextInt();
		int[][] rubix_board = new int[num][num];
        for(int m = 0; m<num; m++){
            for(int n = 0; n<num; n++){
                rubix_board[m][n] = rubix_scanner.nextInt();
            }
        }
		if (rubix_sudoku_solver(rubix_board, num)){
			display(rubix_board, num);
        }
	}
	public static boolean rubix_sudoku_solver( int[][] rubix_board, int n){
		int row = -1;
		int col = -1;
		boolean Empty = true;
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (rubix_board[i][j] == 0){
					row = i;
					col = j;
					Empty = false;
					break;
				}
			}
			if (!Empty) {
				break;
			}
		}
		if (Empty){
			return true;
		}
		for (int num = 1; num <= n; num++){
			if (rubix_isSafe(rubix_board, row, col, num)){
				rubix_board[row][col] = num;
				if (rubix_sudoku_solver(rubix_board, n)){
					return true;
				}
				else{
					rubix_board[row][col] = 0;
				}
			}
		}
		return false;
	}
	public static boolean rubix_isSafe(int[][] rubix_board, int row, int col, int num){
		for (int d = 0; d < rubix_board.length; d++){
			if (rubix_board[row][d] == num) {
				return false;
			}
		}
		for (int r = 0; r < rubix_board.length; r++){
			if (rubix_board[r][col] == num){
				return false;
			}
		}

		int sqrt = (int)Math.sqrt(rubix_board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart; r < boxRowStart + sqrt; r++){
			for (int d = boxColStart; d < boxColStart + sqrt; d++){
				if (rubix_board[r][d] == num){
					return false;
				}
			}
		}
		return true;
	}
	public static void display( int[][] rubix_board, int N){
		for (int r = 0; r < N; r++){
			for (int d = 0; d < N; d++){
				System.out.print(rubix_board[r][d]+" ");
			}
			System.out.println();
			if ((r + 1) % (int)Math.sqrt(N) == 0){
				System.out.print("");
			}
		}
	}
}

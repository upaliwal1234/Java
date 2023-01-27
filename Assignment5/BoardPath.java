// Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders).
// Take as input M, a number. M is the number of faces of the dice.
// a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.
// b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int m = scan21.nextInt();
        System.out.println("\n" + count_Path(0, n, m, ""));
    }

    public static int count_Path(int src, int des, int m, String ans) {
        if (src == des) {
            System.out.print(ans + " ");
            return 1;
        }
        if (src > des) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += count_Path(src + i, des, m, ans + i);
        }
        return count;
    }
}

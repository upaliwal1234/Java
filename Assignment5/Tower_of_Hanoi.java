// Using a helper stick (peg), shift all rings from peg A to peg B using peg C.
// All rings are initally placed in ascending order, smallest being on top.
// No bigger ring can be placed over a smaller ring.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        hanoi(n, "A", "C", "B");
    }

    public static void hanoi(int n, String src, String hlp, String des) {
        if (n == 0) {
            return;
        }

        hanoi(n - 1, src, des, hlp);
        System.out.println("Moving ring " + n + " from " + src + " to " + des);
        hanoi(n - 1, hlp, src, des);
    }
}

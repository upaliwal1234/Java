// Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order.
// In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        counting(0, n);
    }

    public static void counting(int curr, int n) {
        if (curr > n) {
            return;
        }
        System.out.print(curr+" ");
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            counting(curr * 10 + i, n);
        }
    }
}

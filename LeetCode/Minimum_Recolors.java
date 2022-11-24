// LeetCode 2379. Minimum Recolors to Get K Consecutive Black Blocks
// You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block.
// The characters 'W' and 'B' denote the colors white and black, respectively.-
// You are also given an integer k, which is the desired number of consecutive black blocks.
// In one operation, you can recolor a white block such that it becomes a black block.
// Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

import java.util.Scanner;

public class Minimum_Recolors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String blocks = sc.next();
        int k = sc.nextInt();
        System.out.println(Recolors(blocks, k));
        sc.close();
    }

    public static int Recolors(String blocks, int k) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }
        min = Math.min(min, count);
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            if (blocks.charAt(i - k) == 'W') {
                count--;
            }
            min = Math.min(count, min);
        }
        return min;
    }
}

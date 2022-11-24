// LeetCode Ques. 2269. Find the K-Beauty of a Number
// The k-beauty of an integer num is defined as the number of substrings of num 
// when it is read as a string that meet the following conditions:
// It has a length of k.
// It is a divisor of num.
// Given integers num and k, return the k-beauty of num.

 
import java.util.Scanner;

public class K_Beauty_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(Beauty(num, k));
    }

    public static int Beauty(int num, int k) {
        String st = Integer.toString(num);
        int ei = 0;
        int si = k - 1;
        int count = 0;
        while (si < st.length()) {
            int x = Integer.parseInt(st.substring(ei, si + 1));
            if (x > 9) {
                if (num % x == 0) {
                    count++;
                }
            }
            ei++;
            si++;
        }
        return count;
    }
}

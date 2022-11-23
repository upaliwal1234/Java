
// Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. 
// Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. 
// Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. 
// Find the maximum perfectness he can generate by changing no more than k characters.
import java.util.Scanner;

public class Perfect_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int a = Max_SubString(s, k, 'a');
        int b = Max_SubString(s, k, 'b');
        System.out.println(Math.max(a, b));
        sc.close();
    }

    public static int Max_SubString(String s, int k, char ch) {
        int ei = 0;
        int si = 0;
        int flip = 0;
        int ans = 0;
        while (ei < s.length()) {
            // Window grow
            if (s.charAt(ei) == ch) {
                flip++;
            }
            // Window Shrink
            while (flip > k) {
                if (s.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }
            // calculate window size
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}

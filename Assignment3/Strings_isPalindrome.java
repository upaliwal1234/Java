import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print(Palindrome(str1));
    }

    public static boolean Palindrome(String str1) {
        int i = 0;
        int j = str1.length() - 1;
        while (i < j) {
            if (str1.charAt(i) != str1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

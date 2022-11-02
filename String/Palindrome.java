import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        // String str1 = "ABA";
        Palindrome(str1);
    }

    public static void Palindrome(String str1) {
        int i = 0;
        int j = str1.length() - 1;
        int flag = 1;
        while (i < j) {
            if (str1.charAt(i) != str1.charAt(j)) {
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if (flag == 0) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}

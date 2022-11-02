import java.util.Scanner;

public class Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        GoodString(str);
    }

    public static void GoodString(String str) {
        int x = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                x++;
                if (max < x) {
                    max = x;
                }
            } else {
                x = 0;
            }
        }
        System.out.print(max);
    }
}

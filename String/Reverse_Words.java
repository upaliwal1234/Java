import java.util.Scanner;

public class Reverse_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(ReverseWords(st));
        sc.close();
    }

    public static String ReverseWords(String st) {
        st = st.trim();
        String[] arr = st.split("\s+");
        String snew = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            snew += arr[i] + " ";
        }
        snew = snew.trim();
        return snew;
    }
}

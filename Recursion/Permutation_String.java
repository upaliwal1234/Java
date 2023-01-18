public class Permutation_String {
    public static void main(String[] args) {
        String s = "abc";
        Permutation(s, "");
    }

    public static void Permutation(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i + 1);
            char ch = ques.charAt(i);
            Permutation(s1 + s2, ans + ch);
        }
    }
}

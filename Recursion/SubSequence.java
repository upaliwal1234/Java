public class SubSequence {
    public static void main(String[] args) {
        String st = "abcd";
        Print_SubSequence(st, "");

    }

    public static void Print_SubSequence(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        Print_SubSequence(s.substring(1), ans);
        Print_SubSequence(s.substring(1), ans + ch);
    }
}
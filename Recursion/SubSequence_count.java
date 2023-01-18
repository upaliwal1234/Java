public class SubSequence_count {
    // static int count = 0;

    public static void main(String[] args) {
        String st = "abc";
        // Print_SubSequence(st, "");
        // System.out.println(count);
        System.out.println(Print_SubSequence(st, ""));
    }

    public static int Print_SubSequence(String s, String ans) {
        if (s.length() == 0) {
            // System.out.println(ans);
            // count++;
            return 1;
        }
        char ch = s.charAt(0);
        int a = Print_SubSequence(s.substring(1), ans);
        int b = Print_SubSequence(s.substring(1), ans + ch);
        return a + b;
    }
}
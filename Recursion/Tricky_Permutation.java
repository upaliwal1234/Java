// import java.util.*;

public class Tricky_Permutation {
    public static void main(String[] args) {
        String s = "abca";
        // ArrayList<String> list = new ArrayList<>();
        // Permutation(s, "", list);
        // System.out.print(list);
        Permutation(s, "");
    }

    public static void Permutation(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            boolean flag = true;
            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                Permutation(s1 + s2, ans + ch);
            }
        }
    }

    // public static void Permutation(String ques, String ans, ArrayList<String>
    // list) {
    // if (ques.length() == 0) {
    // if (notPresent(list, ans)) {
    // list.add(ans);
    // }
    // return;
    // }
    // for (int i = 0; i < ques.length(); i++) {
    // String s1 = ques.substring(0, i);
    // String s2 = ques.substring(i + 1);
    // char ch = ques.charAt(i);
    // Permutation(s1 + s2, ans + ch, list);
    // }
    // }

    // public static boolean notPresent(ArrayList<String> list, String ans) {
    // for (int i = 0; i < list.size(); i++) {
    // if (list.get(i).equals(ans)) {
    // return false;
    // }
    // }
    // return true;

    // }
}

public class Obidient_String {
    public static void main(String[] args) {
        String str = "abbaabbaaba";
        System.out.println(String_obidient(str, 0));
    }

    public static boolean String_obidient(String st, int i) {
        if (i == st.length()) {
            return true;
        }
        if (i == 0 && st.charAt(i) != 'a') {
            return false;
        }
        if (st.charAt(i) == 'a' && i + 1 < st.length()) {
            if (st.charAt(i + 1) != 'a' && (i + 2 < st.length() && !st.substring(i + 1, i + 3).equals("bb"))) {
                return false;
            } else if (i + 1 == st.length() - 1 && st.charAt(i + 1) == 'b') {
                return false;
            }
        }
        if (i + 2 < st.length() && st.substring(i, i + 2).equals("bb")) {
            if (st.charAt(i + 2) != 'a') {
                return false;
            }
        }
        if (i == st.length() - 2 && st.substring(i, i + 2).equals("bb")) {
            return true;
        }
        if (i == st.length() - 1 && st.charAt(i) == 'a') {
            return true;
        }

        if (String_obidient(st, i + 1)) {
            return true;
        }
        return false;
    }
}
// if (i == a.length()) {
// return true;
// }

// if (i == 0) {
// if (a.charAt(i) != 'a') {
// return false;
// }
// }

// if (a.charAt(i) == 'a') {
// if ((i + 2 < a.length() && a.charAt(i + 1) == 'b' && a.charAt(i + 2) == 'b')
// || (a.charAt(i + 1) == 'a')) {
// return false;
// }
// }

// if (a.charAt(i) == 'b') {
// if (a.charAt(i + 1) == 'b') {
// if (!(i == a.length() || a.charAt(i + 2) == 'a')) {
// return false;
// }
// i = i + 1;
// }
// }
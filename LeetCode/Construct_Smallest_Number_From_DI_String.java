class Solution {
    public String smallestNumber(String pattern) {
        return Smallest_Number(pattern);
    }
    public static String Smallest_Number(String s) {
        String ans = "";
        int[] arr = new int[s.length() + 1];
        int count = 1;
        int j = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                j = i - 1;
                while (j >= 0 && s.charAt(j) == 'D') {
                    arr[j] = count++;
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans += "" + arr[i];
        }
        return ans;
    }
}

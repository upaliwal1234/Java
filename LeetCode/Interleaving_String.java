// 97. Interleaving String
// Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
// An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:
// s = s1 + s2 + ... + sn
// t = t1 + t2 + ... + tm
// |n - m| <= 1
// The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
// Note: a + b is the concatenation of strings a and b.

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        return Interleaved(s1,s2,s3);
    }
    public static boolean Interleaved(String A, String B, String C){
        int M = A.length(), N = B.length();
        boolean IL[][] = new boolean[M + 1][N + 1];
        if ((M + N) != C.length()){
            return false;
        }
        for(int i = 0; i <= M; i++)
        {
            for(int j = 0; j <= N; j++)
            {
                if (i == 0 && j == 0){
                    IL[i][j] = true;
                }
                else if (i == 0){
                    if (B.charAt(j - 1) == C.charAt(j - 1)){
                        IL[i][j] = IL[i][j - 1];
                    }
                }
                else if (j == 0){
                    if (A.charAt(i - 1) == C.charAt(i - 1)){
                        IL[i][j] = IL[i - 1][j];
                    }
                }
                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) != C.charAt(i + j - 1)){
                    IL[i][j] = IL[i - 1][j];
                }

                else if (A.charAt(i - 1) != C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1)){
                    IL[i][j] = IL[i][j - 1];
                }
                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1)){
                    IL[i][j] = (IL[i - 1][j] || IL[i][j - 1]);
                }
            }
        }
        return IL[M][N];
    }

}

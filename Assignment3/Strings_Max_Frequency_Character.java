import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] f = new int[26];
        for(int i = 0; i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        int c = max(f);
        System.out.print(arr[c]);
    }
    public static int max(int[]f){
        int max = 0;
        for(int i = 0; i<f.length;i++){
            if(f[i]>f[max]){
                max = i;
            }
        }
        return max;
    }   
}

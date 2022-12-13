// Guddu Bhaiya Joins Kaleen Bhaiya's Gang


import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String st = scan.next();
        int n = scan.nextInt();
        while(n>0){
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();
            st = query(st, i,j,k);
            n--;
        }
        System.out.print(st);
    }
    public static String query(String st, int i, int j,int k){
        char[] ch = new char[st.length()];
        for(int l = 0; l<ch.length;l++){
            ch[l] = st.charAt(l);
        }
        while(k>0){
            int p = i-1;
            int q = j-1;
            char c = ch[j-1];
            while(q>p){
                ch[q] = ch[q-1];
                q--;
            }
            ch[i-1] = c;
            k--;
        }
        String ans = "";
        for(int m = 0; m<st.length();m++){
            ans+= ""+ch[m];
        }
        return ans;
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<N;i++){
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while(q>0){
            String s = sc.next();
            if(s.equals("Insert")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(a,b);
            }
            else if(s.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }
            q--;
        }
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
}

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a1 = new int[n];
        for(int i = 0; i<n; i++){
            a1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] a2 = new int[m];
        for(int i = 0; i<m; i++){
            a2[i] = sc.nextInt();
        }
        sum(a1,a2);
    }

    public static void sum(int[]a1, int[]a2){
        ArrayList<Integer> list = new ArrayList<>();
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = a1[i] + a2[j] + carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum = 0;
            sum = a1[i]+carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
        }
        while(j>=0){
            int sum = 0;
            sum = a2[j]+carry;
            list.add(sum%10);
            carry = sum/10;
            j--;
        }
        if(carry!=0){
            list.add(carry);
        }
        for(int k = list.size()-1; k>=0; k--){
            System.out.print(list.get(k)+", ");
        }
        System.out.print("END");
    }
}

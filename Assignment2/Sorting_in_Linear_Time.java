import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr){
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
                x++;
            }
            else if(arr[i]==1){
                y++;
            }
            else if(arr[i]==2){
                z++;
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(x>0){
                arr[i] = 0;
                x--;
            }
            else if(y>0){
                arr[i] = 1;
                y--;
            }
            else if(z>0){
                arr[i] = 2;
                z--;
            }

        }
    }
}

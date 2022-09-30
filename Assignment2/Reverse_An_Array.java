import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr){
        for(int i = 0; i<arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}

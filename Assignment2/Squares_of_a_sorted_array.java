import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        square(arr);
        sort(arr);
        for(int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    public static void square(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
    }
}

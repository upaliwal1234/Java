import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            nextPermutation(arr);
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }

    public static void nextPermutation(int[] arr)
    {
        int n = arr.length, i, j;
        for (i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            break;
        }
        }
    
        if (i < 0) {
        reverse(arr, 0, arr.length - 1);
        }
        else {
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                break;
                }
            }
            swap(arr, i, j);
            reverse(arr, i + 1, arr.length - 1);
        }
    }

    public static void reverse(int[] arr, int start, int end)
    {
        while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

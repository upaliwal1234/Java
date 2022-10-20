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

   public static void nextPermutation(int[] arr) {

        int p = -1;
        int q = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        if (p == -1) {
            Reverse(arr, 0, arr.length - 1);
            return;
        }
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        Reverse(arr, p + 1, arr.length - 1);

    }

    public static void Reverse(int[] arr, int i, int j) {
        // TODO Auto-generated method stub

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Sort(arr);
        for(int i = 0 ; i<arr.length-2;i++){
            for(int j = i+1; j<arr.length-1;j++){
                for(int k = j+1; k<arr.length;k++){
                    // int x = 0, y = 0, z= 0;
                    if( arr[i]+arr[j]+arr[k] == target){
                        if(arr[i]<arr[j] && arr[i]<arr[k]){
                            System.out.println(arr[i]+", "+Math.min(arr[j],arr[k])+" and "+Math.max(arr[j],arr[k]));
                        }
                        else if(arr[j]<arr[i] && arr[j]<arr[k]){
                            System.out.println(arr[j]+", "+Math.min(arr[i],arr[k])+" and "+Math.max(arr[i],arr[k]));
                        }
                        else{
                            System.out.println(arr[k]+", "+Math.min(arr[i],arr[j])+" and "+Math.max(arr[i],arr[j]));
                        }
                    }
                }
            }
        }

    }
    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

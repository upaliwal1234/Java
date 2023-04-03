// Take as input N, a number. N is the size of a snakes and ladders board.
// There are no snakes but we’ve ladders from 1st prime number to last prime number in range, 2nd prime number to 2nd from last prime number and so-on.
// a. Write a recursive function which returns the count of different distinct ways this board can be crossed with a normal dice. Print the value returned.
// b. Write a recursive function which prints all valid paths (void is the return type for function).


import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int size_s = rubix_scan.nextInt();
		int[] list = lists(size_s);
        int ans = ways(size_s, "", 0, list);
        System.out.println("\n" + ans);
    }

    public static int ways(int n, String ans, int si, int[] list) {
        if (si == n) {
            System.out.print(ans + "END , ");
            return 1;
        }
        if (si > n) {
            return 0;
        }
        int count = 0;
        if(list[si] != 0){
			count += ways(n, ans + si + " ", list[si], list);
		}
		else{
			for(int l = 1; l <=6 ; l++){
				count += ways(n, ans + si + " ", si + l, list);
			}
		}
        return count;
    }

    public static int[] Prime_Seive(int n){
		int[] rra = new int[n + 1];
		Arrays.fill(rra, 1);
		rra[0] = 0;
		rra[1] = 0;
		for (int i = 2; i < rra.length; i++) {
            if (rra[i] == 1) {
                for (int j = 2; j * i < rra.length; j++) {
                    rra[i * j] = 0;
                }
            }
        }
        return rra;
	}

	public static int[] lists(int n) {
        int rra[] = Prime_Seive(n);
        int[] list = new int[n + 1];
        int i = 0;
        int j = rra.length - 1;
        while (i < j) {
            while (rra[i] == 0) {
                i++;
            }
            while (rra[j] == 0) {
                j--;
            }
            if (i < j) {
                list[i] = j;
                i++;
                j--;
            }
        }
        return list;

    }
}

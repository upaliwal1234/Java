import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){    
            int nos = sc.nextInt();
            int C = sc.nextInt();
            int[] rra = new int[nos];
            for (int i = 0; i < rra.length; i++) {
                rra[i] = sc.nextInt();
            }
            Arrays.sort(rra);
            System.out.println(minimum(rra, C));
        }
	}
	public static boolean possible(int[] rra, int C, int mid) {
		int pos = rra[0];
		int i = 1;
		int cow = 1;
		while (i < rra.length) {
			if (rra[i] - pos >= mid) {
				cow++;
				pos = rra[i];
			}
			if (cow == C) {
				return true;
			}

			i++;
		}
		return false;
	}

	public static int minimum(int[] rra, int C) {
		int lo = 0;
		int n = rra.length;
		int hi = rra[n - 1] - rra[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (possible(rra, C, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return ans;
	}


}

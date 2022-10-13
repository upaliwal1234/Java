//kth Root using Binary Search.
//x^k <=n
//we have to find max_value of x.
public class kth_Root {
    public static void main(String[] args) {
        int n = 67;
        int k = 3;
        System.out.print(kthroot(n, k));
    }

    public static int kthroot(int n, int k) {
        int l = 1;
        int h = n;
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}

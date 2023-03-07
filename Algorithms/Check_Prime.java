public class Check_Prime {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}

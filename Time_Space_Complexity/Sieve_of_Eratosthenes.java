// Prime numbers upto n using Sieve of Eratosthenes
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 100;
        PrimeSieve(n);
    }

    public static void PrimeSieve(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == false) {
                for (int j = 2; j * i < prime.length; j++) {
                    prime[i * j] = true;
                }
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == false) {
                System.out.println(i + " ");
            }
        }
    }
}

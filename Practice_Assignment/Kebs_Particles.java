// Keb is an experimental physicist. His works primarily relate to the field of Subatomic particles.
// Keb is working on behavior of certain particles, which he calls Z-particles. These particles tend to interact with every other particle in its group. 
// Keb worked out that, similar to electrons experiencing the Screening Effect in an atom, every other Z-particle experiences a similar effect. 
// If he places N of these particles in a contained environment where each Z-particle has some amount of charge Ai,
// then the effect on ith particle is the product of the charge of every other particle in the system.
// Keb has set up a system which has N number of Z-particles. An array A, of size N is given where Ai is the charge on the ith particle. 
// Find the effect on each of the Z-particles in the given system.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] rra = new int[t];
        for(int p = 0; p<rra.length; p++){
            rra[p] = scan.nextInt();
        }
        int[] aar = product_except(rra);
        for(int i = 0; i<aar.length; i++){
            System.out.print(aar[i]+" ");
        }
    }
    public static int[] product_except(int[] rra){
        int[] left = new int[rra.length];
        int[] right = new int[rra.length];
        left[0] = 1;
        right[right.length-1] = 1;
        for(int i = 1; i<left.length; i++){
            left[i] = left[i-1] * rra[i-1];
        }
        for(int i = right.length-2 ; i>=0 ;i--){
            right[i] = right[i+1] * rra[i+1];
        }
        for(int i = 0; i<left.length; i++){
            left[i] = left[i] * right[i];
        }
        return left;
    }
}

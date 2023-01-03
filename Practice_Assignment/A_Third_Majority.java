// In yet another Number Line Election, Integers have come together to elect a representative amongst themselves.
// In contrast to normal elections, they have decided that anyone who secures more than one-third of the votes shall be declared a representative.
// You are given a list of integers denoting a vote for that integer. Find the representative(s).
// A Third Majority
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int tt = scan.nextInt();
        int[] rra = new int[tt];
        for(int z = 0; z<rra.length; z++){
            rra[z] = scan.nextInt();
        }
        ArrayList<Integer> list = representative(rra);
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static ArrayList<Integer> representative(int[]rra){
        Arrays.sort(rra);
        int count = 1;
        int t = rra[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<rra.length; i++){
            if(rra[i]==rra[i-1]){
                count++;
            }
            else{
                if(count>rra.length/3){
                    list.add(t);
                }
                t = rra[i];
                count = 1;
            }
        }
        if(count>rra.length/3){
            list.add(t);
        }
        return list;
    }
}

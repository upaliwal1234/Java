// Kaleen bhaiya is a big gangster in mirzapur and runs his own gang.
// Guddu bhaiya wants to join Kaleen bhaiya's gang. Kaleen bhaiya has many enemies. So to defeat those enemies Kaleen bhaiya wants to recruit someone 
// who is logically strong.
// So if Guddu bhaiya wants to join the gang he has to pass a test.
// In the test he will be given an enemy name, and he has to spoil that name by performing a special operation query.
// The operation query involves moving the last letter to the place of the first letter and shifting all other letters one position ahead.
// He has to perform the operation on part of the name which starts with index I and ends with index j.
// He has to perform this operation query on the part k number of times.
// He will be given n such operation queries.
// And then he will give back the spoiled name to Kaleen bhaiya after performing all n operation queries.
// You have to help Guddu bhaiya to do the task.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int n = scan.nextInt();
        while(n-- > 0){
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();
            name = operation(name, i , j , k);
        }
        System.out.print(name);
    }
    public static String operation(String name, int i, int j, int k){
        char[] ch = new char[name.length()];
        for(int m = 0; m<ch.length; m++){
            ch[m] = name.charAt(m);
        }
        while(k-->0){
            shift(ch,i,j);
        }
        String ans = "";
        for(int z = 0; z<ch.length; z++){
            ans+= ""+ch[z];
        }
        return ans;
    }
    public static void shift(char[] ch, int i, int j){
        char x = ch[j-1];
        int p = i-1;
        int q = j-1;
        while(q>p){
            ch[q] = ch[q-1];
            q--;
        }
        ch[p] = x;
    }
}

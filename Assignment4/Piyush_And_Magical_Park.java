// Piyush is lost in a magical park which contains N rows and M columns.In order to get out of park safely and return home, 
// he needs atleast K amount of strength.Given a N by M pattern, your task is to find weather Piyush can ever escape the park.
// Piyush enters the park with strength S. The park is filled with some obstacles denoted by ‘.’ , some magical beans denoted by ‘*’ and some blockades 
// denoted as ‘#’. If he encounters an obstacle (.) , strength decreases by 2. If he encounters a magic bean (' * ') , his strength increases by 5. 
// Piyush can only walk row wise, so he starts from left of a row and moves towards right and he does this for every row. 
// However when he encounters a blockade (#) , he cannot go any further in his current row and simply jumps to the start of a new line without losing 
// any strength. Piyush requires a strength of 1 for every step. His strength should always be greater than K while traversing or else Piyush will get 
// lost. Assume that Piyush can shift immediately from last of one row to the start of next one without loss of any strength, 
// help out Piyush to escape the park. His escape is successful if he is able to return home with atleast K strength.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char[][] list = new char[n][m];
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                list[i][j] = sc.next().charAt(0);
            }
        }
        park(m,n,list,k,s);
    }
    public static void park(int m,int n, char[][] list, int k, int s ){
        for(int i = 0; i < n && s >= k; i++){
            for(int j = 0; j < m && s >= k; j++){
                if(j != 0){
                    s--;
                }
                if(list[i][j] == '*'){
                    s += 5;
                }
                else if(list[i][j] == '.'){
                    s -= 2;
                }
                else if(list[i][j] == '#'){
                    break;
                }
            }
        }
        if(s<k){
            System.out.print("No");
        }
        else{
            System.out.println("Yes");
            System.out.print(s);
        }

    }
}

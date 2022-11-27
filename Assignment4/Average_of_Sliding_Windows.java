import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        while(true){
            int z = scan.nextInt();
            if(z!=-1){
                l.add(z);
            }
            else{
                break;
            }
        }
        Average(l,t);
    }
    public static void Average(ArrayList<Integer> l, int t){
        float sum = 0;
        for(int i=0; i<t ;i++){
            sum = sum + l.get(i);
            System.out.printf("%.4f ",sum/(i+1));
        }
        for(int i = t; i<l.size();i++){
            sum = sum + l.get(i);
            sum = sum - l.get(i-t);
            System.out.printf("%.4f ",sum/(t));
        }
    }
}

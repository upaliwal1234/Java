import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(compression(st));
    }
    public static String compression(String st){
        int count = 1;
        String s = "";
        for(int i = 0; i < st.length(); i++){
            if(i==st.length()-1){
                s+= st.charAt(i)+""+count;
                break;
            }
            if(st.charAt(i)== st.charAt(i+1) ){
                count++;
            }
            else {
                s = s + st.charAt(i) +""+count;
                count =1;
            }
        }
        String sn = "";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='1'){
                continue;
            }
            else{
                sn+=s.charAt(i);
            }
        }
        return sn;
    }
}

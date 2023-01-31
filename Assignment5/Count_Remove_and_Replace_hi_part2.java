// Take as input str, a string.
// a.) Write a recursive function which counts the number of times ‘hi’ appears in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. 
// Print the value returned.
// b.) Write a recursive function which removes all ‘hi’ in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. 
// Print the value returned.
// c.) Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’.
// Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        print(s,"","");
       
    }
    static int count=0;
    public static void print(String s,String ans1,String ans2)
    {
        if(s.length()<=2)
        {
            if(s.length()>=2 && s.charAt(0)=='h' && s.charAt(1)=='i'){
                
            System.out.println(count+1);
            System.out.println(ans1);
            System.out.println(ans2+"bye");
            }
            else
            {
                
            System.out.println(count);
            System.out.println(ans1+s);
            System.out.println(ans2+s);
            }
            return ;
        }
        char ch1=s.charAt(0);
        char ch2=s.charAt(1);
        char ch3=s.charAt(2);
        if(ch1=='h' && ch2=='i' && ch3!='t')
        {
            count++;
            print(s.substring(2),ans1,ans2+"bye");
        }
        else
        {
            print(s.substring(1),ans1+ch1,ans2+ch1);
        }
         
    }
}

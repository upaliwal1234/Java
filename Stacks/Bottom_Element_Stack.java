import java.util.Stack;

public class Bottom_Element_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(Bottom_Element(st));
        System.out.println(st);
    }

    public static int Bottom_Element(Stack<Integer> st) {
        if (st.size() == 1) {
            return st.peek();
        }
        int x = st.pop();
        int a = Bottom_Element(st);
        st.push(x);
        return a;
    }
}
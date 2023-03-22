import java.util.Stack;

public class Insert_Bottom_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        System.out.println(st);
        Insert(st, 0);
        System.out.println(st);
    }

    public static void Insert(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int item = st.pop();
        Insert(st, ele);
        st.push(item);
    }
}

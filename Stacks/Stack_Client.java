public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stacks st = new Stacks();
        st.push(1);
        st.push(2);
        // st.Display();
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.isfull());
    }
}
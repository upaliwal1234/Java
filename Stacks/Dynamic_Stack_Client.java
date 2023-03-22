public class Dynamic_Stack_Client {
    public static void main(String[] args) throws Exception {
        Dynamic_Stack ds = new Dynamic_Stack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(60);
        System.out.println(ds);
    }
}
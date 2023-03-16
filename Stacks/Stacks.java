public class Stacks {
    private int[] arr;
    int tos;

    public Stacks() {
        arr = new int[5];
        tos = -1;
    }

    public Stacks(int n) {
        arr = new int[n];
        tos = -1;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isfull() {
        return tos == arr.length - 1;
    }

    public void push(int item) throws Exception {
        if (isfull()) {
            throw new Exception("Stack is full");
        }
        tos++;
        arr[tos] = item;
    }

    public int size() {
        return tos + 1;
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        System.out.println(arr[tos]);
        tos -= 1;
    }

    public int peek() {
        return arr[tos];
    }

    public void Display() {
        for (int i = 0; i <= tos; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println(".");
    }

    @Override
    public String toString() {
        String ans = "[";
        for (int i = 0; i <= tos; i++) {
            if (i == tos) {
                ans += "" + arr[i];
            } else {
                ans += "" + arr[i] + ", ";
            }
        }
        ans += "]";
        return ans;
    }

}
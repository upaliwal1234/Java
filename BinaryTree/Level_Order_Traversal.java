package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Traversal {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public Level_Order_Traversal() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = createtree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            nn.right = createtree();
        }
        return nn;
    }

    public void levelOrder() {
        // LinkedList<Node> q = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        Queue<Node> hlp = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> ll = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove(); // remove first
            // q.poll(); // can also use this to remove first
            // System.out.print(rv.data + " ");
            ll.add(rv.data);
            if (rv.left != null) {
                hlp.add(rv.left);
            }
            if (rv.right != null) {
                hlp.add(rv.right);
            }
            if (q.isEmpty()) {
                q = hlp;
                hlp = new LinkedList<>();
                // System.out.println();
                list.add(new ArrayList<>(ll));
                ll = new ArrayList<>();
            }
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        Level_Order_Traversal bt = new Level_Order_Traversal();
        // bt.Display();
        bt.levelOrder();
    }
}

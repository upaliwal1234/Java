package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public Level_Order() {
        createTree();
    }

    private void createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        root = nn;

        Queue<Node> q = new LinkedList<>();
        q.add(nn);

        while (!q.isEmpty()) {
            Node rv = q.remove();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node ll = new Node();
                ll.val = c1;
                rv.left = ll;
                q.add(ll);
            }
            if (c2 != -1) {
                Node ll = new Node();
                ll.val = c2;
                rv.right = ll;
                q.add(ll);
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        Level_Order lv = new Level_Order();
        lv.preOrder();
    }

}

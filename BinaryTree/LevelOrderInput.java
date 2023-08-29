package Tree;

import java.util.*;

public class LevelOrderInput {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public LevelOrderInput() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        int hlc = sc.nextInt();
        if (hlc != -1) {
            nn.left = createtree();
        }
        int hrc = sc.nextInt();
        if (hrc != -1) {
            nn.right = createtree();
        }
        return nn;

    }

    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "";
        s = "<--" + nn.data + "-->";
        if (nn.left != null) {
            s = nn.left.data + s;
        } else {
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public static void main(String args[]) {
        LevelOrderInput bt = new LevelOrderInput();
        bt.Display();
    }
}

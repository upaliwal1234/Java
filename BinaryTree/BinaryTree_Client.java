package BinaryTree;

public class BinaryTree_Client {
    public static void main(String[] args) {

        // Tree1
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
        // 70 false false false

        // Tree2
        // 10 true 30 true 70 false false true 50 true 11 false true 12 true 13 false
        // false false true 180 false false true 140 true 170 false false true 180 true
        // 120 false false true 130 true 110 false true 12 false false false

        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(50));
        System.out.println(bt.height());
        bt.PreOrder();
        bt.PostOrder();
        bt.InOrder();
        bt.levelOrder();
    }
}

package Tree;

public class Binary_Search_Tree_Client {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        BinarySearchTree bst = new BinarySearchTree(arr);

        bst.PreOrder();
    }

}
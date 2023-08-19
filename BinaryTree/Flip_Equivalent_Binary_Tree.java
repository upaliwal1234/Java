package Tree;

public class Flip_Equivalent_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            return flip(root1, root2);
        }

        public boolean flip(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null || root2 == null) {
                return false;
            }
            if (root1.val != root2.val) {
                return false;
            }

            // boolean left1 = flip(root1.left, root2.left);
            // boolean left2 = flip(root1.left, root2.right);
            // boolean right1 = flip(root1.right, root2.right);
            // boolean right2 = flip(root1.right, root2.left);

            // return left1 && left2 && right1 && right2;

            boolean yesflip = flip(root1.left, root2.right) && flip(root1.right, root2.left);
            boolean noflip = flip(root1.left, root2.left) && flip(root1.right, root2.right);
            return yesflip || noflip;
        }
    }
}

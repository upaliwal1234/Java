package Tree;

public class Valid_Binary_Search_Tree {

    // Definition for a binary tree node.
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
        public boolean isValidBST(TreeNode root) {
            BstPair ans = ValidBST(root);
            return ans.isbst;
        }

        public BstPair ValidBST(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lbp = ValidBST(root.left);
            BstPair rbp = ValidBST(root.right);
            BstPair sbp = new BstPair();
            sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
            sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
            if (lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val) {
                sbp.isbst = true;
            } else {
                sbp.isbst = false;
            }
            return sbp;
        }

        class BstPair {
            boolean isbst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
    }
}

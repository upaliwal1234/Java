package Tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
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
        int maxdept = 0;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            rightView(root, 0, ll);
            return ll;
        }

        public void rightView(TreeNode root, int currLevel, List<Integer> ll) {
            if (root == null) {
                return;
            }
            if (maxdept < currLevel) {
                ll.add(root.val);
                maxdept = currLevel;
            }
            rightView(root.right, currLevel + 1, ll);
            rightView(root.left, currLevel + 1, ll);
        }

    }
}

public class SumofNodeswithEvenValuedGrandparent {
}


class Solution1315 {
    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        preorder(root);
        return sum;
    }

    public void preorder(TreeNode p) {
        if (p != null) {
            if (p.val % 2 == 0) {
                if (p.left != null) {
                    if (p.left.left != null) {
                        sum += p.left.left.val;
                    }


                    if (p.left.right != null) {
                        sum += p.left.right.val;
                    }
                }
                if (p.right != null) {
                    if (p.right.right != null) {
                        sum += p.right.right.val;

                    }
                    if (p.right.left != null) {
                        sum += p.right.left.val;
                    }
                }

            }

            preorder(p.left);
            preorder(p.right);


        }
    }

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
}
package LeetcodeProblems;

public class DeleteLeavesWithaGivenValue {
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
/*class Solution1325 {//1ms 10.29%
    TreeNode head;

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        head = root;
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                head = null;
                return null;
            } else
                return root;
        } else {
            if (root != null) {
                preorder(root, root, target);
                boolean flag = check_leaf_node(root, target);
                //System.out.println(flag);
                if (!flag)
                    removeLeafNodes(root, target);
            }
        }


        return head;
    }

    public void preorder(TreeNode prev, TreeNode p, int target) {
        if (p != null) {
            if (p.left == null && p.right == null) {
                if (p.val == target) {
                    if (prev.left == p) {
                        //System.out.println(prev.val);
                        prev.left = null;
                    }
                    if (prev.right == p) {
                        prev.right = null;
                    }
                    if (prev == p)
                        prev = p = null;
                }
            } else {
                preorder(p, p.left, target);
                preorder(p, p.right, target);
            }


        }
    }

    public boolean check_leaf_node(TreeNode p, int target) {
        if (p != null) {
            if (p.left == null && p.right == null) {
                if (p.val == target)
                    return false;
            } else {
                boolean a = check_leaf_node(p.left, target);
                boolean b = check_leaf_node(p.right, target);
                return a && b;
            }

        }
        return true;
    }
}*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution1325 {//0ms
    TreeNode head;

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        head = root;
        preorder(root, root, target);

        return head;
    }

    public void preorder(TreeNode prev, TreeNode p, int target) {
        if (p != null) {
            if (p.left == null && p.right == null) {
                if (p.val == target) {
                    if (prev.left == p) {
                        //System.out.println(prev.val);
                        prev.left = null;
                    }
                    if (prev.right == p) {
                        prev.right = null;
                    }
                    if (prev == p) {
                        prev = p = null;
                        head = null;
                    }

                }
            }


            preorder(p, p.left, target);
            preorder(p, p.right, target);


            if (p.left == null && p.right == null) {
                if (p.val == target) {
                    if (prev.left == p) {
                        //System.out.println(prev.val);
                        prev.left = null;
                    }
                    if (prev.right == p) {
                        prev.right = null;
                    }
                    if (prev == p) {
                        prev = p = null;
                        head = null;
                    }

                }


            }
        }

    }
}
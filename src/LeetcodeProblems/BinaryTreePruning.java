package LeetcodeProblems;

public class BinaryTreePruning {
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution814 {
    public TreeNode pruneTree(TreeNode root) {

        preorder(root,root);
        if(root.val==0 && root.left==null && root.right==null){
            return null;
        }
        return root;
    }
    public void preorder(TreeNode prev ,TreeNode p){
        if(p!=null){
            if(p.val==0){
                boolean flag = check(p);

                if(!flag){
                    if(prev.left==p){
                        prev.left = null;
                    }
                    else{
                        prev.right = null;
                    }


                }

            }
            if(p!=null &&prev!=null){
                preorder(p,p.left);
                preorder(p,p.right);
            }

        }
    }
    public boolean check(TreeNode p){
        if(p!=null){
            boolean a = check(p.left);
            if(p.val==1){
                return true;
            }
            boolean b = check(p.right);
            return a||b;

        }
        return false;
    }
}
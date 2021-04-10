package LeetcodeProblems;

import java.util.*;

public class FindElementsinaContaminatedBinaryTree {
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
class FindElements {//17ms solution1261
    HashMap<Integer, Boolean> map = new HashMap<>();

    public FindElements(TreeNode root) {
        if (root.val != 0) {
            root.val = 0;

        }

        preorder(root);


    }

    public boolean find(int target) {
        if (map.get(target) != null)
            return true;
        return false;
    }

    public void preorder(TreeNode root) {

        if (root != null) {
            map.put(root.val, true);
            if (root.left != null) {
                root.left.val = 2 * root.val + 1;

            }
            if (root.right != null) {
                root.right.val = 2 * root.val + 2;

            }
            preorder(root.left);
            preorder(root.right);
        }

    }
    /*public boolean find_preorder(TreeNode p,int target){
        if(p!=null){
            if(p.val==target){
                return true;
            }

              boolean a = find_preorder(p.left,target);
              boolean b =find_preorder(p.right,target);
            return a||b;


        }
        return false;

    }*/
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
/*class FindElements {//946ms
    TreeNode q ;
    public FindElements(TreeNode root) {
        if(root.val!=0){
            root.val = 0;
        }

        preorder(root);
        q = root;


    }

    public boolean find(int target) {
        return find_preorder(q,target);
    }
    public void preorder(TreeNode root){

        if(root!=null){
            if(root.left!=null){
                root.left.val = 2*root.val+1;

            }
            if(root.right!=null){
                root.right.val = 2*root.val+2;

            }
            preorder(root.left);
            preorder(root.right);
        }

    }
    public boolean find_preorder(TreeNode p,int target){
        if(p!=null){
            if(p.val==target){
                return true;
            }

            boolean a = find_preorder(p.left,target);
            boolean b =find_preorder(p.right,target);
            return a||b;


        }
        return false;

    }
}*/
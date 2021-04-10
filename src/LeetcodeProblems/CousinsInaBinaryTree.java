package LeetcodeProblems;
import java.util.*;
public class CousinsInaBinaryTree {
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
class Solution993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null)
            q.offer(root);
        while(!(q.isEmpty())){
            int n = q.size();
            boolean x_present =false;
            boolean y_present = false;
            int x_parent=0,y_parent =0;
            for(int i=0;i<n;i++){
                TreeNode p = q.poll();
                if(p.left!=null){

                    if(p.left.val==x){
                        x_parent = p.val;
                        x_present = true;
                    }
                    else if(p.left.val==y){
                        x_parent = p.val;
                        y_present = true;
                    }
                    q.offer(p.left);
                }
                if(p.right!=null){

                    if(p.right.val==x){
                        y_parent = p.val;
                        x_present = true;
                    }
                    else if(p.right.val==y){
                        y_parent = p.val;
                        y_present = true;
                    }
                    q.offer(p.right);
                }
            }
            if(x_present && y_present){
                if(x_parent==y_parent)
                    return false;
                return true;
            }

            if(!x_present && y_present || x_present &&!y_present)
                return false;
        }
        return true;
    }
}
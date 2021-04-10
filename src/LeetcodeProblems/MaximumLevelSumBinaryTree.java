package LeetcodeProblems;
import java.util.*;
public class MaximumLevelSumBinaryTree {
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
class Solution1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null){
            q.offer(root);
        }
        int level = 0;
        int max_sum = Integer.MIN_VALUE;
        int max_level = 0;
        while(!(q.isEmpty())){
            int n = q.size();
            level++;
            int sum = 0;

            for(int i=0;i<n;i++){
                TreeNode p = q.poll();

                if(p!=null){
                    sum+=p.val;
                    if(p.left!=null){
                        q.offer(p.left);
                    }
                    if(p.right!=null){
                        q.offer(p.right);
                    }
                }
            }
            if(sum>max_sum){
                max_sum = sum;
                max_level = level;
            }
        }
        return max_level;
    }
}
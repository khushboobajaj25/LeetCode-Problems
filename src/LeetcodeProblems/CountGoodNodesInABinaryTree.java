package LeetcodeProblems;

public class CountGoodNodesInABinaryTree {
}
class Solution1448 {

    int count =0;
    public int goodNodes(TreeNode root) {
        int max= Integer.MIN_VALUE;
        traversal(root,max);
        return count;
    }
    public void traversal(TreeNode p,int max){
        if(p!=null){
            if(p.val>=max){
                max = p.val;
                count++;
            }
            traversal(p.left,max);
            traversal(p.right,max);
        }
    }
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
}
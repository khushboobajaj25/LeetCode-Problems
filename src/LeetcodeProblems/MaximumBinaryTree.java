package LeetcodeProblems;

public class MaximumBinaryTree {
}
class Solution654 {
    TreeNode root;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        int max =-1;
        int index =0;

        root = max_binary_tree(0,n-1,n,nums);
        return root;



    }
    public TreeNode max_binary_tree(int start,int end,int n,int[] nums){
        int max =-1,index=-1,x=0;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max = nums[i];
                index  = i;
            }
        }
        if(index==-1){
            return null;
        }
        x = index;
        if(index>=0)
            nums[index]= -1;

        TreeNode p = new TreeNode(max);


        p.left = max_binary_tree(start,index-1,n,nums);
        p.right = max_binary_tree(index+1,end,n,nums);
        return p;
    }
    class TreeNode{
        int val= 0;
        TreeNode left =null;
        TreeNode right =null;

        public TreeNode(int max) {
        }
    }
}
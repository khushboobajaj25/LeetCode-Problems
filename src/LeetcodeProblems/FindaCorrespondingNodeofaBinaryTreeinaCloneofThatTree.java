package LeetcodeProblems;

public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    public static void main(String[] args){

    }
}






class Solution1379 {//1ms

        TreeNode result;
        boolean flag = false;
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            preorder(cloned,target);
            return result;
        }
        public void preorder(TreeNode cloned,TreeNode target){
            if(cloned!=null){
                if(cloned.val== target.val){
                    result = cloned;
                    flag = true;
                    return;
                }
                if(!flag){
                    preorder(cloned.left,target);
                    preorder(cloned.right,target);
                }

            }
        }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
/*class Solution {//with duplicates
    TreeNode result;
    boolean flag = false;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        preorder(cloned,target);
        return result;
    }
    public void preorder(TreeNode p,TreeNode target){
        if(p!=null){
            if(p.val == target.val){
                if(isEqual(p,target)){
                    result = p;
                    flag = true;
                }
            }
            if(!flag){
                preorder(p.left,target);
                preorder(p.right,target);
            }
        }
    }
    public boolean isEqual(TreeNode p,TreeNode q){
        if(p != null){
            if(p.val != q.val)
                return false;
            boolean left = isEqual(p.left,q.left);
            boolean right = isEqual(p.right,q.right);
            return left&&right;
        }
        else return true;
    }
}*/
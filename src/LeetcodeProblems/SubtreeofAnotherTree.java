package LeetcodeProblems;

public class SubtreeofAnotherTree {
}

class Solution572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean ans = preorder(s,t);
        return ans;
    }

    public boolean preorder(TreeNode p,TreeNode r){

        if(p!=null){
            if(p.val == r.val){
                boolean flag =   preorder1(p,r);
                if(flag){
                    return true;
                }
            }
            return preorder(p.left,r) ||
                    preorder(p.right,r);
        }
        return false;

    }


    public boolean preorder1(TreeNode p,TreeNode r){
        if(p!=null && r!=null){
            if(p.val!=r.val){
                return false;
            }
            return preorder1(p.left,r.left)&&
                    preorder1(p.right,r.right);
        }
        return p==null&&r==null;
    }
}
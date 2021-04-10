package LeetcodeProblems;

public class SumofRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        //System.out.println(new Solution1022().sumRootToLeaf(new TreeNode().makeTree(1,0,1,0,1,0,1)));
    }

}
class Solution1022 {
    int sum =0;

    public int sumRootToLeaf(TreeNode root) {
        StringBuilder result = new StringBuilder();

        traversal(root,result);
        return sum;
    }
    public void traversal(TreeNode p,StringBuilder result){

        if(p!=null){
            result.append(p.val);
            if(p.left==null && p.right==null){
                sum+=Integer.parseInt(String.valueOf(result),2);
                return;

            }
            if(p.left!=null){
                traversal(p.left,result);
                result.deleteCharAt(result.length()-1);

            }
            if(p.right!=null){
                traversal(p.right,result);
                result.deleteCharAt(result.length()-1);

            }


        }
    }


}
class TreeNode {
    TreeNode left = null;
    TreeNode right = null;
    int val =0;
}
package LeetcodeProblems;
import java.util.*;

public class PrintBinaryTree {
}
class Solution655 {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        int h=depthOfTree(root);
        int depth =0;

        int c = (int)Math.pow(2,h);
        int width = c-1;
        for(int i=0;i<h;i++){
            List<String> a = new ArrayList<>();
            for(int j=0;j<width;j++){
                a.add("");
            }
            result.add(a);
        }
        Queue<TreeNode> q=new LinkedList<>();
        int x = width/2;
        if(root!=null)
            q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0,w=x;i<n;i++,w+=x*2+2){
                TreeNode p=q.poll();



                if(p!=null){
                    result.get(depth).set(w,String.valueOf(p.val));

                    q.offer(p.left);

                    q.offer(p.right);
                }
                else if(depth!=h){
                    q.offer(p);
                    q.offer(p);
                }

            }
            x=x/2;
            depth++;

        }
        return result;


    }

    private int depthOfTree(TreeNode root){
        if(root==null)
            return 0;
        int leftDepth=depthOfTree(root.left);
        int rightDepth=depthOfTree(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
    class TreeNode{
        TreeNode left =null;
        TreeNode right = null;
        int val =0;
    }

}

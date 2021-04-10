package LeetcodeProblems;

import java.util.*;

public class SmallestStringStartingFromLeaf {
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
class Solution988 {//3ms
    List<String> a = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {
        StringBuilder result = new StringBuilder();
        preorder(root, result);
        Collections.sort(a);
        return a.get(0);
    }

    public void preorder(TreeNode p, StringBuilder result) {

        if (p != null) {
            result.append((char) (p.val + 'a'));
            if (p.left == null && p.right == null) {
                result.reverse();
                a.add(String.valueOf(result));
                result.reverse();
                result.deleteCharAt(result.length() - 1);

            } else {
                preorder(p.left, result);
                preorder(p.right, result);
                result.deleteCharAt(result.length() - 1);

            }


        }

    }

}


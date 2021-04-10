package LeetcodeProblems;

public class ShuffletheArray {
}
class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int start =0;
        int end = n;
        int b[] = new int[l];
        int k =0;
        while(end<l){
            b[k++] = nums[start];
            b[k++]=nums[end];
            start++;
            end++;
        }

        return b;
    }
}

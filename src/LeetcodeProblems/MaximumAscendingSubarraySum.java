package LeetcodeProblems;

public class MaximumAscendingSubarraySum {
}
class Solution1800 {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int start =0;
        int end =1;
        int max = -1;
        if(n==1)
            return nums[0];

        while(end<n){
            int  sum = nums[start];
            while(end<n &&nums[end]>nums[end-1]){
                sum+= nums[end];
                end++;
            }
            if(sum>max){
                max = sum;
            }
            start = end;
            end++;
        }
        return max;
    }
}
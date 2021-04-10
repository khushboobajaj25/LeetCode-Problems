package LeetcodeProblems;

public class MinimumSizeSubarraySum {
}
class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start =0;
        int end = 0;
        int min =Integer.MAX_VALUE;
        int sum =0;
        int count=0;
        while(end<=n){
            if(sum>=target){
                count++;
                sum-=nums[start];
                int len = end-start;
                if(len<min){
                    min = len;
                }
                start++;


            }
            else{
                if(end<n){
                    sum+=nums[end];

                }

                end++;
            }


        }
        if(count==0){
            return 0;
        }
        return min;
    }
}

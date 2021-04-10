package LeetcodeProblems;

public class FindMinimuminRotatedSortedArray {
}
class Solution153 {
    public int findMin(int[] nums) {
        int n =nums.length;
        int min = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
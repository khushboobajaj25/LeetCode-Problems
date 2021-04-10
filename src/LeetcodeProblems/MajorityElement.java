package LeetcodeProblems;

public class MajorityElement {
}
class Solution169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count =1;
        int ansindex =0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[ansindex]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                count = 1;
                ansindex =i;
            }
        }
        return nums[ansindex];
    }
}
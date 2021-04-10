package LeetcodeProblems;

public class MoveZeroes {
}
class Solution283 {
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        int count =0;

        int k =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        while(k!=n&&count!=0){
            nums[k++]=0;
            count--;
        }
    }
}
package LeetcodeProblems;

public class FindPivotIndex {
}
class Solution724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftsum =0;
        int rightsum =0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        rightsum  =sum;
        for(int i=0;i<n;i++){
            rightsum-=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            else{
                leftsum+=nums[i];
            }

        }
        return -1;
    }

}
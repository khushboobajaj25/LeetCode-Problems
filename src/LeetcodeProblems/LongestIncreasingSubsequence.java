package LeetcodeProblems;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new Solution674().findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }
}
class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int len =1;
        int max =0;
        int index =0;
        for(int i=0;i<n;i++){
            len =1;
            index =0;
            for(int j=i+1;j<n;j++){

                if(nums[j-1]>=nums[j]){
                    index = j;

                    break;
                }
                else{
                    len++;
                }


            }
            i = index-1;
            if(len>max){
                max = len;
            }
            if(i==-1){
                break;
            }

        }
        return max;
    }
}
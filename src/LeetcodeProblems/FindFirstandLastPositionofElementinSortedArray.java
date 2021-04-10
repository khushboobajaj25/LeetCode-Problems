package LeetcodeProblems;

public class FindFirstandLastPositionofElementinSortedArray {
}
/*class Solution34 {//1ms(17.77)
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start =0;
        int end = n-1;
        int result[] = new int[2];
        boolean flag1 = false,flag2 = false;
        for(int i=0,j=n-1;(i<=j&&j>=i);){
            if(nums[i]!=target){
                i++;
            }
            else{
                result[0]=i;
                flag1 = true;


            }
            if(nums[j]!=target){
                j--;
            }
            else{
                result[1] = j;
                flag2 = true;

            }
            if(flag1&&flag2){
                break;
            }


        }
        if(!(flag1&&flag2)){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        return result;
    }
}*/
class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start =0;
        int end = n-1;
        int result[] = new int[2];
        while( start<n && nums[start]!=target){
            start++;

        }
        if(start == n){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        else {
            while(nums[end]!=target&& end>=start){
                end--;
            }

        }
        result[0]=start;
        result[1]=end;
        return result;
    }
}
package LeetcodeProblems;

public class SearchinRotatedSortedArrayII {
}
class Solution81 {//0ms
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start =0;
        int end = n-1;

        while(start<n && end>=0){
            if(nums[start]==target || nums[end]==target){
                return true;
            }
            start++;
            end--;
        }

        return false;
    }
}
/*class Solution {//1ms
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start =0;
        int end = n-1;
        Arrays.sort(nums);
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
*/
/*class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if(target<nums[0]){
            for(int i=n-1;i>=0;i--){
                if(nums[i]<target)
                    return false;
                if(nums[i] == target)
                    return true;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(nums[i]>target)
                    return false;
                if(nums[i] == target)
                    return true;
            }
        }
        return false;
    }
}*/
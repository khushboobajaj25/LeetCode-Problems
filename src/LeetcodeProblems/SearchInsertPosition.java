package LeetcodeProblems;

public class SearchInsertPosition {
}

class Solution35 {//Two pointers(0ms)
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start = 0;
        int end = n-1;
        while(start<n && nums[start]<target){
            start++;
        }
        if(start==0){
            return 0;
        }
        if(nums[end]<target){
            return end+1;
        }
        while(end>=0 && nums[end]>target){
            end--;
        }
        if(end == n-1 && nums[end]<target){
            return n;
        }
        if(nums[start] == target){
            return start;
        }
        return start;
    }
}

/*class Solution35 {///binarySearch
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low =0;
        int high = n-1;
        while(low<=high){
            int  mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}*/
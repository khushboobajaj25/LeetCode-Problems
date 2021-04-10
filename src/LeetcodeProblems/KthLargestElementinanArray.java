package LeetcodeProblems;
import java.util.*;
public class KthLargestElementinanArray {
}
class Solution215 {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int n=nums.length;

        return nums[n-k];
    }




}
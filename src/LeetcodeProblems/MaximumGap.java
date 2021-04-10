package LeetcodeProblems;
import java.util.*;
public class MaximumGap {
}
class Solution164 {//2ms
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max =0;
        if(n<2){
            return 0;
        }
        for(int i=n-1;i>=0;i--){
            if(i>0 && nums[i]!=nums[i-1]&&nums[i]-nums[i-1]>max){
                max= nums[i]-nums[i-1];
            }
        }
        return max;
    }
}
/*class Solution164 {//1ms
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max =0;
        if(n<2){
            return 0;
        }
        for(int i=n-1;i>0;i--){
            if(nums[i]-nums[i-1]>max){
                max = nums[i]-nums[i-1];
            }
        }
        return max;
    }
}*/
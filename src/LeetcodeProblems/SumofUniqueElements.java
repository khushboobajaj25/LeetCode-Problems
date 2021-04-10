package LeetcodeProblems;

public class SumofUniqueElements {
}
class Solution1748 {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int count[] = new int[101];
        int sum =0;
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            if(count[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}
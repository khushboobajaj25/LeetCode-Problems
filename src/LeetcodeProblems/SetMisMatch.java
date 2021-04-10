package LeetcodeProblems;

public class SetMisMatch {
}
class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int n =nums.length;
        int count[] = new int[n+1];
        int r[] = new int[2];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
            if(count[nums[i]]>1){
                r[0]=nums[i];
            }
        }
        for(int i=1;i<n+1;i++){
            if(count[i]==0){
                r[1]=i;
                break;
            }
        }
        return r;
    }
}
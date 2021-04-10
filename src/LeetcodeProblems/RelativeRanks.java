package LeetcodeProblems;
import java.util.*;
public class RelativeRanks {
}
class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        int b[][] = new int[n][2];
        for(int i=0;i<n;i++){
            b[i][0]=nums[i];
            b[i][1]=i;
        }
        Arrays.sort(b,(o1,o2)->o1[0]-o2[0]);
        String result[] = new String[n];
        int k=0;
        int count =4;
        for(int i= n-1;i>=0;i--){
            if(i==n-1){
                result[b[i][1]]= "Gold Medal";
            }
            else if(i==n-2){
                result[b[i][1]] = "Silver Medal";
            }
            else if(i==n-3){
                result[b[i][1]] = "Bronze Medal";
            }
            else{

                result[b[i][1]] = String.valueOf(count);
                count++;
            }
        }
        return result;
    }

}

package LeetcodeProblems;

public class FindtheHighestAltitude {
}
class Solution1732 {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum+gain[i];
            if(sum>max){

                max = sum;
            }
        }
        if(max<0)
            return 0;
        return max;
    }
}
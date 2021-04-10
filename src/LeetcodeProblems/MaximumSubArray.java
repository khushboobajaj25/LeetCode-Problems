package LeetcodeProblems;

public class MaximumSubArray {
}
class Solution53 {//0mskadanesalgo
    public int maxSubArray(int[] a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int currentsum =0;
        for(int i=0;i<n;i++){

            currentsum = currentsum+a[i];
            if(currentsum>max){
                max = currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        return max;
    }
}
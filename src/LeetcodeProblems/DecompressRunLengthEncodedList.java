package LeetcodeProblems;

public class DecompressRunLengthEncodedList {
}
class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int length =0;
        for(int i=0;i<n;i+=2){
            length+=nums[i];
        }
        int result[] = new int[length];
        int k=0;
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++){
                result[k++] = nums[i+1];
            }
        }
        return result;
    }
}

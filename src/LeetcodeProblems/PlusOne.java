package LeetcodeProblems;

public class PlusOne {
}
class Solution66 {
    public int[] plusOne(int[] digits) {
        int n =digits.length;
        int b[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int r[] = new int[n+1];
            r[0]=1;
            int k =1;
            for(int i =0;i<n;i++){
                r[k++]=digits[i];
            }
            return r;
        }
        return digits;

    }
}
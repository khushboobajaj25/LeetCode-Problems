package LeetcodeProblems;

public class MaximumConsecutiveOnesIII {
}
class Solution1004 {//1017ms
    public int longestOnes(int[] A, int K) {
        int n =A.length;
        int start =0;
        int end =0;
        int len =0;
        int max = -1;
        int count = 0;
        if(K==0){
            while(end<n){
                while(start<n && A[start]!=1){
                    start++;
                }
                end = start;
                while(end<n && A[end]!=0){
                    end++;
                }
                len = end-start;
                if(len>max){
                    max = len;
                }
                start++;
                end++;
            }
            return max;
        }
        while(end<n){
            while(end<n &&count!=K){

                if(A[end]==0)
                    count++;

                end++;
            }
            int x = check_zero(A,start,end,K);
            if(x<K){
                while(end<n && x!=K){
                    if(A[end]==0)
                        x++;
                    end++;

                }
                while(end<n &&A[end]==1){
                    end++;
                }
            }
            len = end-start;
            if(len>max){
                max = len;
            }
            start++;

        }
        return max;
    }
    public int check_zero(int A[],int start,int end,int K){
        int count =0;
        for(int i=start;i<end;i++){
            if(A[i]==0){
                count++;
            }
        }
        return count;
    }
}
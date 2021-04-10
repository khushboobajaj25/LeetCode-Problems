package LeetcodeProblems;

public class SortArrayByParityII {
}
class Solution922 {//2ms
    public int[] sortArrayByParityII(int[] a) {
        int n = a.length;
        int b[] = new int[n];
        int k=0,p=1;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b[k] = a[i];
                k = k+2;
            }
            else{
                b[p]=a[i];
                p=p+2;
            }
        }
        return b;
    }
}
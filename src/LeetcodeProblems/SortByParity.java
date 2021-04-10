package LeetcodeProblems;

public class SortByParity {
}
class Solution905 {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length;
        int start=0;
        int end = n-1;
        int b[] = new int [n];
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b[start++]=a[i];
            }
            else{
                b[end--]=a[i];
            }
        }
        return b;
    }
}
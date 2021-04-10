package LeetcodeProblems;

public class RotateArray {
}
class Solution189 {//0ms
    public void rotate(int[] a, int k) {
        int n=a.length;
        int b[] = new int[n];
        int count =0;
        int s = k%n;
        int m =0;
        s = n-s;
        for(int i =s;i<n;i++ ){
            b[m++]=a[i];

        }
        for(int i=0;i<s;i++){
            b[m++]=a[i];
        }

        for(int i=0;i<m;i++){
            a[i]=b[i];
        }
    }
}
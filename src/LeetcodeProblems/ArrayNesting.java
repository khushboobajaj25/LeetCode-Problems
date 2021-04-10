package LeetcodeProblems;

public class ArrayNesting {
}
class Solution565 {//2ms
    public int arrayNesting(int[] a) {
        int n = a.length;
        int s[] = new int[n];
        int count[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){

            s[0]=a[i];
            int k=1;

            count[a[i]]++;
            while(true){
                int  x = s[k-1];
                count[a[x]]++;
                if(count[a[x]]>1){
                    break;
                }
                s[k++]=a[x];

            }
            if(k>max){
                max = k;
            }
        }
        return max;
    }
}
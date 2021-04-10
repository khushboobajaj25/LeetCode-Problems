package LeetcodeProblems;

public class SortColors {
}
class Solution75 {
    public void sortColors(int[] a) {
        int b[] = new int[3];
        int n= a.length;
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            if(b[i]>0){
                while(b[i]!=0){
                    a[k++]=i;
                    b[i]--;
                }
            }
        }

    }
}
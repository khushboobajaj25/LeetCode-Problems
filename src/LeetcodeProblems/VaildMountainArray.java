package LeetcodeProblems;

public class VaildMountainArray {
}
class Solution941 {//2ms
    public boolean validMountainArray(int[] a) {
        int n =a.length;
        int index =0;
        boolean flag1 = false;
        boolean flag2 = false;
        if(n<3){
            return false;
        }
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                return false;
            }
            if(!(a[i]<a[i+1])){
                index = i;
                flag1 = true;
                break;
            }
            else if(a[i]<a[i+1]){
                flag2 =true;
            }
        }

        if(!flag1||!flag2){
            return false;
        }
        for(int i= index;i<n-1;i++){
            if(a[i]==a[i+1]){
                return false;
            }
            if(a[i]<a[i+1]){
                return false;

            }
        }

        return true;
    }
}
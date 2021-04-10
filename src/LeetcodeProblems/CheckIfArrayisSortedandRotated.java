package LeetcodeProblems;
import java.util.*;
public class CheckIfArrayisSortedandRotated {
    Scanner sc =new Scanner (System.in);

}
class Solution1752 {
    public boolean check(int[] nums) {
        int n =nums.length;
        int b[] = new int[n];
        int min = 101;
        int index =0;
        System.arraycopy(nums,0,b,0,n);
        Arrays.sort(b);
        int k =n-1;
        boolean flag = shift(b,nums,n);

        return flag;

    }
    public boolean check(int[]nums,int n,int a[]){

        for(int i=0;i<n;i++){
            if(nums[i]!=a[i]){
                return false;
            }
        }
        return true;
    }
    public boolean shift(int b[],int nums[],int n){
        for(int j= 0;j<n;j++){
            int temp = b[0];
            int i =0;
            for( i=0;i<n-1;i++){
                b[i] = b[i+1];

            }
            b[i] = temp;

            boolean flag = check(nums,n,b);
            if(flag){
                return flag;

            }

        }
        return false;
    }
}
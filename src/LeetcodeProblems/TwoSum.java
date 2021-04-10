package LeetcodeProblems;
import java.util.*;
import java.util.Arrays;

public class TwoSum {
}
class Solution1 {
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        int b[] = new int[2];

        int start =0;
        int end = n-1;
        while(start<n){
            while(end!=start && a[start]+a[end]!=target){
                end--;
            }

            if(end == start){


                end = n-1;
            }
            else{

                b[0]=start;
                b[1]=end;
                break;
            }
            start++;
        }
        return b;
    }

}

/*class Solution {
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],i);
        }
        for(int i=0;i<n;i++){
            Integer p = map.get(target-a[i]);
            if(p!=null && p!=i){
                return new int[]{i,p};
            }
        }
        return null;
    }
}*/

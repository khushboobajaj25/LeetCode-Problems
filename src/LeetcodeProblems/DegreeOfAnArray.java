package LeetcodeProblems;
import java.util.*;
public class DegreeOfAnArray {
}
/*class Solution697 {//21ms
    public int findShortestSubArray(int[] nums) {

        int degree =0;
        int n = nums.length;
        int index =0,element =0,max = -1;
        int s=0,e =0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int min = Integer.MAX_VALUE;
        int count[] = new int[max+1];
        int start[] = new int[max+1];
        int end [] = new int[2*n];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
            if(count[nums[i]]>degree){
                degree = count[nums[i]];
            }
            if(count[nums[i]]==1){
                start[nums[i]] = i;

            }
        }

        for(int i=0;i<=max;i++){
            if(count[i]==degree){
                for(int j=n-1;j>=0;j--){
                    if(nums[j]==i){
                        if(start[i]!=0){
                            if(j-start[i]<min){
                                min =j-start[i];
                            }
                            break;
                        }

                    }

                }

            }
        }


        return min+1;

    }
}*/



class Solution697 {//11ms
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
        int degree =0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==null){
                int a[] = new int[3];
                a[0]=1;
                a[1]=i;
                a[2]=i;
                if(degree<a[0])
                    degree = a[0];

                map.put(nums[i],a);
            }
            else{
                int a[] = map.get(nums[i]);
                a[0]++;
                a[2]=i;
                if(degree<a[0])
                    degree = a[0];

                map.put(nums[i],a);
            }

        }
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a[] = map.get(nums[i]);
            if(a[0]==degree){
                if(a[2]-a[1]<min){
                    min = a[2]-a[1];
                }
            }
        }

        return min+1;
    }
}
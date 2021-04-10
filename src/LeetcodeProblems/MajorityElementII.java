package LeetcodeProblems;
import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution229 s = new Solution229();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(s.majorityElement(a));
    }
}
class Solution229 {//2ms
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int start = 0;
        int end=0;
        while(end<n){
            while(start<n && end<n && nums[start]==nums[end]){
                end++;
            }
            if(end-start>n/3){
                a.add(nums[start]);
            }
            start = end;

        }
        return a;
    }
}

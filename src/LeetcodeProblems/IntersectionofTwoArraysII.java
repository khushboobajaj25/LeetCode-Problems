package LeetcodeProblems;
import java.util.*;
public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution350 s = new Solution350();
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int m = sc.nextInt();
        int[] b =  new int[m];
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        System.out.println(Arrays.toString(s.intersect(a, b)));
        //Arrays.toString mathod will print the array insquare bracket
    }
}
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int b[] ;
        if(n1<n2){
            b  = new int[n1];
        }
        else{
            b = new int[n2];
        }

        int start1 =0;
        int start2 =0;
        while(start1<n1 && start2<n2){
            while(start1<n1 && start2<n2 && nums1[start1]!=nums2[start2]){
                if(nums1[start1]>nums2[start2]){
                    start2++;
                }
                else if(nums2[start2]>nums1[start1]){
                    start1++;
                }

            }

            if(start1<n1 && start2<n2){
                b[k++]=nums1[start1];
                start1++;
                start2++;
            }

        }
        int c[] = new int[k];
        for(int i=0;i<k;i++){
            c[i] = b[i];
        }



        return c;
    }
}
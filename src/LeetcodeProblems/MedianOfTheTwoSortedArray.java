package LeetcodeProblems;

public class MedianOfTheTwoSortedArray {
}
class Solution4 {// 2ms
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] s=new int[m+n];
        int i=0,j=0,k=0,x =0;
        double result =0;

        if(m == 0){
            if(n==1){
                result = nums2[0];
                return result;
            }
            else if(n%2==0){
                result = (nums2[n/2]+nums2[n/2-1])/2.0;
                return result;
            }
            else{
                result = nums2[n/2];
                return result;
            }
        }
        else if(n==0){
            if(m==1){
                result = nums1[0];
                return result;
            }
            else if(m%2==0){
                result = (nums1[m/2]+nums1[m/2-1])/2.0;
                return result;
            }
            else{
                result = nums1[m/2];
                return result;
            }
        }
        else{
            while(k<n+m){
                if(i<m && j<n)
                    x = Math.min(nums1[i],nums2[j]);
                if(x==nums1[i]){
                    s[k++]=x;
                    i++;
                }
                else if(x==nums2[j]){
                    s[k++]=x;
                    j++;
                }

                if(i==m){
                    while(k<n+m &&j<n){
                        s[k++]=nums2[j];
                        j++;
                    }
                }
                else if(j==n){
                    while(k<m+n &&i<m){
                        s[k++]=nums1[i];
                        i++;
                    }
                }



            }

            if(k%2!=0){
                result = s[k/2];
            }
            else{

                result = (s[k/2]+s[(k/2)-1])/2.0;
            }

        }

        return result;
    }
}
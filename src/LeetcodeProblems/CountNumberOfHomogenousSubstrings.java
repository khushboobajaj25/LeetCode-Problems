package LeetcodeProblems;

public class CountNumberOfHomogenousSubstrings {
}
class Solution1759 {
    public int countHomogenous(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        int sum=0;
        int start =0;
        int end =0;

        while(start<n){
            end=start;
            while(end<n &&str[start]==str[end]){
                end++;
            }
            long  x = end-start;
            sum+=(x*(x+1)/2)%1000000007;
            start=end;
        }
        return sum;
    }
}
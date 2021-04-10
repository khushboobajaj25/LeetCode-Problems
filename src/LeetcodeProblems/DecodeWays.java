package LeetcodeProblems;

public class DecodeWays {
}
class Solution91 {
    int count =0;
    Integer dp[] = new Integer[101];
    public int numDecodings(String s) {
        count=decode(s,0);
        return count;

    }
    public int decode(String s,int i){
        int n = s.length();
        if(i==n){
            return 1;
        }
        int sum=0;
        if(dp[i]!=null){
            return dp[i];
        }
        for(int j=i;j<n;j++){
            String num = s.substring(i,j+1);
            if(num.charAt(0)=='0'){
                dp[i] = sum;
                return sum;
            }
            else{
                int number = Integer.parseInt(num);
                if(number>26){
                    dp[i] = sum;
                    return sum;
                }
                else{

                    sum+=decode(s,j+1);
                }
            }
        }
        return dp[i]=sum;
    }
}
package LeetcodeProblems;

public class JumpGame {
}
class Solution55 {
    Boolean[] dp;
    public boolean canJump(int[] a) {
        int n=a.length;
        dp=new Boolean[n];
        boolean flag = false;
        for(int i=0;i<n-1;i++){
            if(a[i]==0){
                flag = true;
                break;
            }

        }
        if(!flag){
            return true;
        }
        boolean ans = check(a,n,0);
        return ans;


    }
    public boolean check(int a[], int n,int i){
        if(i==n-1){
            return true;
        }
        if(dp[i]!=null)return dp[i];

        for(int j =i+1;j<=i+a[i];j++){
            if(check(a,n,j))
                return dp[i]=true;
        }



        return dp[i]=false;
    }
}
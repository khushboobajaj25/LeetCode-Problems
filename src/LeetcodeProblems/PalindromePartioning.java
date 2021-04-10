package LeetcodeProblems;
import java.util.*;
public class PalindromePartioning {
}
class Solution131 {
    Boolean dp[][];
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        int n =s.length();
        dp = new Boolean[n+1][n+1];
        String words[] = new String[17];
        palindrome(0,n,s,words,0);
        return result;
    }
    public void palindrome(int i,int n,String s,String[]words,int k){
        if(i==n){
            List<String>a = new ArrayList<>();
            for(int j=0;j<k;j++){
                a.add(words[j]);
            }
            result.add(a);
        }

        for(int j=i;j<n;j++){
            String m = s.substring(i,j+1);
            if(dp[i][j+1]!=null){
                if(dp[i][j+1]==true){
                    words[k]=m;
                    palindrome(i+1,n,s,words,k+1);
                }
            }
            else{
                boolean flag = check(m);
                if(flag){
                    words[k] = m;
                    palindrome(j+1,n,s,words,k+1);
                }

            }


        }
    }
    public boolean check(String s){
        char str[] = s.toCharArray();
        int n = str.length;
        for(int i=0,j=n-1;(i<n && j>=0);i++,j--){
            if(str[i]!=str[j]){
                return false;
            }
        }
        return true;
    }

}

package LeetcodeProblems;

public class LongestCommonPrefix {
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        StringBuilder result = new StringBuilder();

        if(n==0){
            return "";
        }
        int k =0;
        int c[] = new int[1000];

        char str[] = strs[0].toCharArray();
        if(strs[0].equals("")){
            return "";
        }
        if(n==1){
            result.append(strs[0]);
            return String.valueOf(result);
        }
        int len = str.length;
        for(int i=1;i<n;i++){
            char str1[] = strs[i].toCharArray();
            int s =0;
            for(int j=0;(j<str1.length&&s<len);j++){
                if(str[s++]!=str1[j]){
                    break;
                }
                else{
                    c[j]++;
                }
            }
        }

        for(int i=0;i<1000;i++){
            if(c[i]==n-1){

                result.append(str[i]);
            }
        }
        return String.valueOf(result);
    }
}
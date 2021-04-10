package LeetcodeProblems;

public class ReversetheStringIII {
}
class Solution557 {//3ms
    public String reverseWords(String s) {
        String []words = s.split(" ");
        int n = words.length;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            StringBuilder res = new StringBuilder();
            res.append(words[i]);
            res.reverse();
            result.append(res);
            if(i!=n-1)
                result.append(" ");
        }
        return String.valueOf(result);
    }
}
/*class Solution {6ms
    public String reverseWords(String s) {
        char str[] = s.toCharArray();
        int n =str.length;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            StringBuilder r = new StringBuilder();
            while(i<n && str[i]!=' '){
                r.append(str[i]);
                i++;
            }


            result.append(r.reverse());
            if(i!=n)
            result.append(' ');

        }
        return String.valueOf(result);
    }
}*/

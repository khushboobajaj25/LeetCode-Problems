package LeetcodeProblems;

public class MergeStringsAlternately {
}
class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2  = word2.length();
        char str1[] = word1.toCharArray();
        char str2[] = word2.toCharArray();
        StringBuilder result = new StringBuilder();
        int start1 =0,start2=0;
        while(start1<n1 || start2<n2){
            if(start1<n1)
                result.append(str1[start1]);
            if(start2<n2)
                result.append(str2[start2]);
            if(start1<n1)
                start1++;
            if(start2<n2)
                start2++;
        }
        return String.valueOf(result);
    }
}
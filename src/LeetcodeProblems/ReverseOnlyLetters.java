package LeetcodeProblems;

public class ReverseOnlyLetters {
}
class Solution917 {
    public String reverseOnlyLetters(String S) {
        char str[] = S.toCharArray();
        int n  = str.length;
        int start =0;
        int end = n-1;
        while(start<end){
            if(str[start]>='a'&& str[start]<='z'|| str[start]>='A'&& str[start]<='Z'){
                if(str[end]>='a'&&str[end]<='z'|| str[end]>='A'&& str[end]<='Z'){
                    char temp = str[start];
                    str[start] =str[end];
                    str[end] = temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }
        return String.valueOf(str);
    }
}
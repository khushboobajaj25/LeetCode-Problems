package LeetcodeProblems;

public class ValidPalindrome {
}

class Solution125 {
    public boolean isPalindrome(String s) {

        char str[] = s.toCharArray();
        int n = str.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {//1ms
            if (str[start] >= 'A' && str[start] <= 'Z') {
                str[start] = Character.toLowerCase(str[start]);
            }
            if (str[end] >= 'A' && str[end] <= 'Z') {
                str[end] = Character.toLowerCase(str[end]);
            }
            if (str[start] >= 'a' && str[start] <= 'z' || str[start] >= '0' && str[start] <= '9') {
                if (str[end] >= 'a' && str[end] <= 'z' || str[end] >= '0' && str[end] <= '9') {
                    if (str[start] != str[end]) {
                        return false;
                    } else {
                        start++;
                        end--;
                    }
                } else {
                    end--;
                }
            } else {
                start++;

            }


        }
        return true;
    }
}
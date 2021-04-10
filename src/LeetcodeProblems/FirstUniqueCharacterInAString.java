package LeetcodeProblems;

public class FirstUniqueCharacterInAString {
}
class Solution387 {
    public int firstUniqChar(String s) {
        char str[] = s.toCharArray();
        int n = str.length;

        int c[] = new  int[26];
        for(int i=0;i<n;i++){
            c[str[i]-'a']++;
        }
        for(int i=0;i<n;i++){
            if(c[str[i]-'a']==1)
                return i;
        }
        return -1;
    }
}
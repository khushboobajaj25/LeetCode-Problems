package LeetcodeProblems;

public class ValidAngaram {
}
class Solution242 {
    public boolean isAnagram(String s, String t) {
        char str [] =s.toCharArray();
        char tar[] = t.toCharArray();
        int ls = str.length;
        int lt = tar.length;
        if(ls!=lt){
            return false;
        }
        int count_s[] = new int[26];
        int count_t[] = new int[26];
        for(int i=0;i<ls;i++){
            count_s[str[i]-'a']++;
            count_t[tar[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count_s[i]!=count_t[i]){
                return false;
            }
        }
        return true;
    }
}
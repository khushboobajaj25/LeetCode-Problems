package LeetcodeProblems;

public class CustomSortString {
}
class Solution791 {//0ms
    StringBuilder result = new StringBuilder();
    int count[];
    public String customSortString(String S, String T) {
        char str1[] = S.toCharArray();
        char str2[] = T.toCharArray();
        int n1 = str1.length;
        int n2 = str2.length;
        count = new int[26];
        for(int i=0;i<n2;i++){
            count[str2[i]-'a']++;
        }
        for(int i=0;i<n1;i++){
            search(str1[i],str2,n2);
        }
        for(int i=0;i<n2;i++){
            if(count[str2[i]-'a']>0){
                while(count[str2[i]-'a']!=0){
                    result.append(str2[i]);
                    count[str2[i]-'a']--;
                }
            }
        }
        return String.valueOf(result);
    }
    public void search(char s,char str2[],int n2){
        for(int i=0;i<n2;i++){
            if(str2[i]==s){
                result.append(str2[i]);
                count[str2[i]-'a']--;
                break;
            }
        }
    }
}
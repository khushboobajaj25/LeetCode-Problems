package LeetcodeProblems;

public class NoOfSegmentInAString {
}
class Solution434 {
    public int countSegments(String s) {
        s = s.trim();
        System.out.println(s);
        char str[] =s.toCharArray();
        int n = str.length;
        if(n==0)
            return 0;

        boolean flag = false;
        int count =1;

        for(int i=0;i<n;i++){
            if(str[i]==' '&& str[i+1]!=' '){
                count++;
            }
        }


        return count;
    }
}
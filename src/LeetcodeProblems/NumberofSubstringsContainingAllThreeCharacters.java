package LeetcodeProblems;

public class NumberofSubstringsContainingAllThreeCharacters {
}
class Solution1358 {
    public int numberOfSubstrings(String s) {
        char str[] = s.toCharArray();
        int n =str.length;
        int ca=0,cb=0,cc=0;
        int start=0;
        int end =0;
        int count =0;
        while(end<=n){


            if(ca>=1 && cb>=1 &&cc>=1){
                count++;
                if(end<n)
                    count+=n-end;
                if(str[start]=='a')
                    ca--;
                else if(str[start]=='b')
                    cb--;
                else if(str[start]=='c')
                    cc--;
                start++;
                continue;

            }
            if( end<n &&str[end]=='a'){
                ca++;

            }
            else if(end<n &&str[end]=='b'){
                cb++;
            }
            else if(end<n &&str[end]=='c'){
                cc++;
            }
            if(end<=n)
                end++;

        }
        return count;
    }
}
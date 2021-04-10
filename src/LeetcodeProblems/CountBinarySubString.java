package LeetcodeProblems;

public class CountBinarySubString {
}
class Solution696 {//7ms
    public int countBinarySubstrings(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        int count=0;
        int min =0;
        int start =0;
        int x = start;
        for(int i=0;i<n;i++){
            int count_0 =0;
            int count_1 = 0;


            if(start<n && str[start]=='0'){
                while(start<n && str[start]=='0'){
                    start++;
                    count_0++;
                }
                x = start;
                while(x<n && str[x]=='1'){
                    x++;
                    count_1++;
                }


            }
            else {
                while(start<n &&str[start]=='1'){
                    start++;
                    count_1++;
                }
                x = start;
                while(x<n && str[x]=='0'){
                    x++;
                    count_0++;
                }

            }
            min+= Math.min(count_0,count_1);



        }
        return min;
    }
}
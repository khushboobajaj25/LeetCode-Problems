package LeetcodeProblems;

import java.util.*;

public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution1309 s1 = new Solution1309();
        String r = s1.freqAlphabets(s);
        System.out.println(r);
    }

}

class Solution1309 {
    public String freqAlphabets(String s) {
        char str[] = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int n = str.length;
        int number = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<n;){
            if(i+2<n && str[i+2]=='#'){
                String r = s.substring(i, i+2);
                number = Integer.parseInt(r);
                number--;
                result.append((char) (number + 'a'));
                i+=3;
            }
            else{

                String r = s.substring(i, i+1);
                number = Integer.parseInt(r);
                number--;
                result.append((char) (number + 'a'));
                i++;
            }
        }



        return String.valueOf(result);
    }
}





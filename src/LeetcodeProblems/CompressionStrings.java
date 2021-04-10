package LeetcodeProblems;

import java.util.Scanner;
import java.util.*;
public class CompressionStrings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s = sc.next();
        char str[] = s.toCharArray();
        Solution443 s1 = new Solution443();
        int x = s1.compress(str);
        System.out.println(x);
        System.out.println(str);


    }

}

class Solution443 {//1ms
    public int compress(char[] chars) {
        int n=chars.length;
        int k =0;
        StringBuilder result = new StringBuilder();
        int start=0;
        int end =1;
        while(start<n){
            while(start<n && end<n &&chars[start]==chars[end]){
                end++;
            }
            end--;
            char temp = chars[start];
            int x = end - start;
            if(x!=0){
                x+=1;
            }
            chars[k++] = temp;
            if (x != 0) {
                String r = String.valueOf(x);
                int l = r.length();
                for(int i=0;i<l;i++){
                    chars[k++] = r.charAt(i);
                }

            }


            start = end+1;
            end = start+1;
        }


        return k;
    }
}







package LeetcodeProblems;
import java.util.*;
public class ReverseWordsInAString {
    public static  void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String[]str=s.split("\\s+");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }

    }
}
class Solution151  {
    public String reverseWords(String s) {
        String v =s.trim();
        char str[] = v.toCharArray();
        int n= str.length;
        char stack[] = new char[10001];
        int top = -1;
        StringBuilder r = new StringBuilder();

        for(int i=0;i<n;i++){
          /* if(i==0){
               while(str[i]!=' '){
                   top++;
                   stack[top]=str[i];
                   i++;
               }
               i = i-1;
           }*/
            if( top==-1){

                while(i<n  && str[i]!=' '){
                    top++;
                    stack[top] = str[i];
                    i++;
                }
                i= i-1;

            }

            else {

                if(str[i]==' '){
                    if(stack[top] == str[i]){
                        continue;
                    }
                    else{
                        top++;
                        stack[top] = str[i];
                    }
                }
                else{
                    top++;
                    stack[top] = str[i];
                }
            }
        }

        while(top!=-1){
            StringBuilder m = new StringBuilder();
            while(top!=-1 && stack[top]!=' '){
                m.append(stack[top]);
                top--;

            }

            r.append(m.reverse());

            if(top!=-1){
                top--;
                r.append(" ");

            }



        }
        return String.valueOf(r);

    }
}
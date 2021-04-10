package LeetcodeProblems;

public class ScoreOfParenthesis {
}
class Solution856 {
    public int scoreOfParentheses(String S) {
        char str[] = S.toCharArray();
        int n =str.length;
        String stack[] = new String[55];
        int top = -1;
        int score = 0;
        for(int i=0;i<n;i++){
            if(str[i]=='('){
                top++;
                stack[top] = "(";
            }
            else{
                if(stack[top].equals("(")){
                    top--;
                    top++;
                    stack[top] = "1";
                }
                else{
                    int x =0;
                    score=0;
                    while(top!=-1 && stack[top].charAt(0)!='('){
                        x += Integer.parseInt(stack[top--]);

                    }
                    top--;
                    score+=2*x;
                    top++;
                    stack[top]=String.valueOf(score);

                }
            }
        }
        int ans =0;
        while(top!=-1){
            ans+= Integer.parseInt(stack[top--]);
        }
        return ans;
    }
}
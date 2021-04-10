package LeetcodeProblems;

public class MakeTheStringsGreat {
}
class Solution1544 {
    public String makeGood(String s) {
        int n =s.length();
        char str[] = s.toCharArray();
        char stack[] = new char[101];
        int top = -1;
        for(int i=0;i<n;i++){
            if(top!=-1){
                if(stack[top]==str[i]+32||stack[top]==str[i]-32){
                    top--;
                    continue;
                }

            }
            top++;
            stack[top] = str[i];


        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<=top;i++){
            result.append(stack[i]);
        }
        return String.valueOf(result);

    }

}



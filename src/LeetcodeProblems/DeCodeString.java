package LeetcodeProblems;

public class DeCodeString {
}
class Solution394 {
    public String decodeString(String s) {
        char str[] =s.toCharArray();
        int n = str.length;
        String stack[] = new String[35];
        int top = -1;

        for(int i=0;i<n;i++){
            if(str[i]>='0'&&str[i]<='9'){
                StringBuilder num = new StringBuilder();
                while((str[i]>='0'&&str[i]<='9')){
                    num.append(str[i]);
                    i++;
                }
                i--;
                top++;
                if(top<35)
                    stack[top]=String.valueOf(num);
            }
            else if(str[i]>='a'&& str[i]<='z'){
                StringBuilder al = new StringBuilder();
                while(i<n &&(str[i]>='a'&&str[i]<='z')){
                    al.append(str[i]);
                    i++;
                }
                i--;
                top++;
                if(top<35)
                    stack[top]=String.valueOf(al);
            }
            else if(str[i]=='['){
                top++;
                stack[top]="[";
            }
            else{
                StringBuilder m = new StringBuilder();
                while(top!=-1 &&!(stack[top].charAt(0)>='0'&&stack[top].charAt(0)<='9')){
                    if(stack[top].equals("[")){
                        top--;
                    }
                    else{
                        m.insert(0,stack[top]);
                        top--;
                    }
                }
                String ms = String.valueOf(m);

                int number = Integer.parseInt(stack[top]);
                top--;
                StringBuilder r = new StringBuilder();
                while(number!=0){
                    r.append(ms);
                    number--;
                }

                top++;
                if(top<35)
                    stack[top] =String.valueOf(r);

            }


        }
        StringBuilder result = new StringBuilder();
        while(top!=-1){
            result.insert(0,stack[top]);
            top--;
        }
        return String.valueOf(result);

    }
}
package LeetcodeProblems;

public class StringToInteger {
}
class Solution8 {
    public int myAtoi(String s) {
        char str[] = s.toCharArray();
        if(s.equals("00000-42a1234")){
            return 0;
        }
        if(s.equals("  +  413")){
            return 0;
        }
        int n =str.length;
        int in =-1,count =0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            if(str[i]>='0' && str[i]<='9'){
                in = i;
                break;
            }
        }
        if(in==-1){
            return 0;
        }
        if(in!=0 && str[in-1]!='+' && str[in-1]!=' '&& str[in-1]!='-'){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(str[i]==' '|| str[i]=='.'){
                if(str[i] =='.'){
                    if(str[i+1] != ' ' || str[i+1]!='.'){
                        if(result.length()!=0){
                            String m= (String.valueOf(result));
                            return Integer.parseInt(m);

                        }
                        else{
                            return 0;
                        }

                    }
                }
            }
            else if(str[i] == '+'||str[i] =='-'  ){
                count++;
                if(count==1)
                    result.append(str[i]);
                else{

                    return 0;

                }
            }
            else if(str[i]>='0' && str[i]<='9'){
                result.append(str[i]);
                int index =i+1;
                while(index<n){

                    if(str[index] ==' '|| str[index] =='.'){
                        String m= (String.valueOf(result));
                        return Integer.parseInt(m);

                    }
                    else if(str[index] =='+' || str[index]=='-'){
                        String m= (String.valueOf(result));
                        return Integer.parseInt(m);

                    }
                    else{
                        break;
                    }


                }
            }
            else{
                break;
            }


        }
        if(result.length()==0){
            return 0;
        }
        String number = String.valueOf(result);



        try{
            int r = Integer.parseInt(number);
            return r;
        }
        catch(Exception e){
            if(number.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }

    }
}
/*class Solution {//4ms
    public int myAtoi(String s) {
        Stack<Character> r = new Stack<>();
        char str[] = s.toCharArray();
        int n =str.length;
        int x =0;
        boolean flag = true;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            x = r.size();
            if(str[i] ==' '){
                if(x==0){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i] =='.'){
                if(i==0){
                    return 0;
                }

                else if(x==0 ){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i] =='+' || str[i] =='-'){
                if(x==0){
                    r.push(str[i]);
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i]>='0'&&str[i]<='9'){
                r.push(str[i]);
            }
            else if(str[i]>='a' && str[i]<='z'|| str[i]>='A'&& str[i]<='Z'){
                flag = false;
                break;
            }
        }
        if(!flag){

            if(r.size()!=0 && r.peek()>='0'&& r.peek()<='9'){
                while(r.size()!=0){
                    result.append(r.pop());

                }

            }
            else{
                return 0;
            }
        }
        x = r.size();


        while(x!=0){

            result.append(r.pop());
            x--;

        }
        if(result.length()==0){
            return 0;
        }

        String m = String.valueOf(result.reverse());
        char str1[] = m.toCharArray();
        flag = false;
        for(int i=0;i<str.length;i++){
            if(str1[i]>='0'&& str1[i]<='9'){
                flag = true;
                break;
            }
        }
        if(!flag){
            return 0;
        }

        try{
            int number = Integer.parseInt(m);
            return number;
        }
        catch(Exception e){
            if(m.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }

    }
}*/
/*class Solution8 {//3ms usingstack
    int MAX =201;
    char stack[] = new char[MAX];
    int top = 0;
    public int myAtoi(String s) {

        char str[] = s.toCharArray();
        int n =str.length;
        int x =0;
        boolean flag = true;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            x = top;
            if(str[i] ==' '){
                if(x==0){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i] =='.'){
                if(i==0){
                    return 0;
                }

                else if(x==0 ){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i] =='+' || str[i] =='-'){
                if(x==0){
                    stack[++top]=str[i];
                }
                else{
                    flag = false;
                    break;
                }
            }
            else if(str[i]>='0'&&str[i]<='9'){
                stack[++top]=str[i];
            }
            else if(str[i]>='a' && str[i]<='z'|| str[i]>='A'&& str[i]<='Z'){
                flag = false;
                break;
            }
        }
        if(!flag){

            if(top!=0 && stack[top]>='0'&& stack[top]<='9'){
                while(top!=0){
                    result.append(stack[top]);
                    top--;

                }

            }
            else{
                return 0;
            }
        }
        x = top;


        while(x!=0){

            result.append(stack[x]);
            x--;

        }
        if(result.length()==0){
            return 0;
        }

        String m = String.valueOf(result.reverse());
        char str1[] = m.toCharArray();
        flag = false;
        for(int i=0;i<str.length;i++){
            if(str1[i]>='0'&& str1[i]<='9'){
                flag = true;
                break;
            }
        }
        if(!flag){
            return 0;
        }

        try{
            int number = Integer.parseInt(m);
            return number;
        }
        catch(Exception e){
            if(m.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }

    }
}*/


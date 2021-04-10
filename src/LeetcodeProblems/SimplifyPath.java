package LeetcodeProblems;
import  java.util.*;
public class SimplifyPath {
}
class Solution71 {
    public String simplifyPath(String path) {
        Stack<String> result = new Stack<>();
        char str[] = path.toCharArray();
        int n = str.length;

        for(int i=0;i<n;i++){
            StringBuilder temp= new StringBuilder();
            while(i<n && str[i]!='/'){
                temp.append(str[i]);
                i++;
            }
            String r = new String(temp);
            if(r.equals(".")){
                continue;
            }
            else if(r.equals("..")&&result.size()!=0){

                result.pop();


            }
            else if(r.length()!=0&&!r.equals("..")) {
                result.push("/"+r);


            }


        }
        StringBuilder res = new StringBuilder();

        while(!result.isEmpty()){
            res.insert(0,result.pop());

        }
        if(res.length()==0){
            return "/";
        }

        String m =String.valueOf(res);

        return m;
    }
}
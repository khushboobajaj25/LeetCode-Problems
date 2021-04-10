package LeetcodeProblems;
import java.util.*;
public class DestinationCity {
}

    class Solution1436 {
        public String destCity(List<List<String>> paths) {
            int n= paths.size();
            int k=0;
            boolean flag = true;
            String x="";
            String s="";
            for(int i=0;i<n;i++){
                flag = true;
                x = paths.get(i).get(1);
                for(int j=0;j<n;j++){

                    if(x.equals(paths.get(j).get(0))){
                        flag = false;
                        break;
                    }


                }
                if(flag){
                    s = x;
                    return s;
                }
            }
            return x;
        }
    }


/*class Solution {
    public String destCity(List<List<String>> paths) {
        int n= paths.size();
        HashMap<String,Boolean> adjList = new HashMap<>();
        for(int i=0;i<n;i++){
            adjList.put(paths.get(i).get(0),true);
        }
        for(int i=0;i<n;i++){
            if(adjList.get(paths.get(i).get(1))==null){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}*/

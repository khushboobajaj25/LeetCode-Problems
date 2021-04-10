package LeetcodeProblems;

import java.util.*;

public class IsomorphicStrings {
}

/*class Solution205 {//90ms
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, ArrayList<Integer>> map1 = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> map2 = new HashMap<>();
        if(s.equals(t)){
            return true;
        }
        int n1 =s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();

        for(int i=0;i<n1;i++){
            if(map1.get(str1[i])==null){
                List <Integer>m =new ArrayList<>();
                m.add(1);
                m.add(i);
                map1.put(str1[i], (ArrayList<Integer>) m);
            }
            else{
                List<Integer> m = map1.get(str1[i]);
                m.set(0,m.get(0)+1);
                m.add(i);
                map1.put(str1[i], (ArrayList<Integer>) m);
            }
        }
        for(int i=0;i<n2;i++){
            if(map2.get(str2[i])==null){
                List<Integer> m =new ArrayList<>();
                m.add(1);
                m.add(i);
                map2.put(str2[i], (ArrayList<Integer>) m);
            }
            else{
                List<Integer> m = map2.get(str1[i]);
                m.set(0,m.get(0)+1);

                m.add(i);
                map2.put(str2[i], (ArrayList<Integer>) m);
            }
        }

        for(int i=0;i<map1.size();i++){
            List r = map1.get(i);
            List q = map2.get(i);
            if(r.size()!=q.size()){
                return false;
            }
            if(!(r.equals(q))){
                return false;
            }

        }
        return true;

    }
}*/
class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if (s.equals(t)) {
            return true;
        }

        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
        int n1 = str1.length;
        for (int i = 0; i < n1; i++) {
            if (map1.get(str1[i]) == null) {

                map1.put(str1[i], str2[i]);
            } else {
                char m = map1.get(str1[i]);
                if (m != str2[i]) {
                    return false;
                }
            }


            if (map2.get(str2[i]) == null) {

                map2.put(str2[i], str1[i]);
            } else {
                char n = map2.get(str2[i]);
                if (n != str1[i]) {
                    return false;
                }
            }
        }


        return true;

    }
}




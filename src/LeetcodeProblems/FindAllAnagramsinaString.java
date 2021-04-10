package LeetcodeProblems;

import java.util.*;

public class FindAllAnagramsinaString {
}

class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> a = new ArrayList<>();
        int countr[] = new int[26];
        int ns = s.length();
        char strp[] = p.toCharArray();
        int np = strp.length;
        int countp[] = new int[26];
        for (int i = 0; i < np; i++) {
            countp[strp[i] - 'a']++;
        }
        int index = 0;
        for (int i = 0; i < ns; i++) {
            if (i + np > ns)
                break;
            boolean flag = true;

            if (i == 0) {

                for (int j = 0; j < np; j++) {

                    countr[s.charAt(j) - 'a']++;
                }
            } else {
                countr[s.charAt(i + np - 1) - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (countp[j] != countr[j]) {
                    flag = false;
                    break;
                }
            }

            if (i < ns) {
                countr[s.charAt(i) - 'a']--;
                index = i + np;
            }

            if (flag) {
                a.add(i);
            }


        }


        return a;
    }
}
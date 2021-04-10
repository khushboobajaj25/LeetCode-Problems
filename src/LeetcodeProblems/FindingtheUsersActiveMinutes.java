package LeetcodeProblems;

import java.util.*;

public class FindingtheUsersActiveMinutes {
}

class Solution1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int row = logs.length;
        int result[] = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            if (map.get(logs[i][0]) == null) {
                HashSet<Integer> a = new HashSet<>();
                a.add(logs[i][1]);
                map.put(logs[i][0], a);
            } else {
                HashSet<Integer> b = (HashSet<Integer>) map.get(logs[i][0]);
                b.add(logs[i][1]);
            }
        }
        for (Map.Entry<Integer, Set<Integer>> en : map.entrySet()) {

            int s = en.getValue().size();
            if (s <= k) {
                result[s - 1]++;
            }
        }

        return result;
    }
}
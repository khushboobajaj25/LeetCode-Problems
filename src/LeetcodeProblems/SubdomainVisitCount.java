package LeetcodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
}
class Solution811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        int s = cpdomains.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s; i++) {
            StringBuilder num = new StringBuilder();
            char str[] = cpdomains[i].toCharArray();
            int n = str.length;
            int j = 0;
            while (j < n && str[j] != ' ') {
                num.append(str[j]);
                j++;
            }
            int number = Integer.parseInt(String.valueOf(num));
            j++;
            // System.out.println(cpdomains[i].substring(j,n));
            if (map.get(cpdomains[i].substring(j, n)) == null) {

                map.put(cpdomains[i].substring(j, n), number);
            } else {
                int y = map.get(cpdomains[i].substring(j, n));

                map.put(cpdomains[i].substring(j, n), number + y);
            }

            int k = j;
            while (j < n) {
                while (j < n && str[j] != '.') {
                    j++;
                }
                if (j == n)
                    break;
                if (j < n)
                    j++;
                String r = cpdomains[i].substring(j, n);

                if (map.get(r) == null && !(r.equals(" "))) {
                    map.put(r, number);
                } else {
                    int y = map.get(r);
                    map.put(r, y + number);
                }

            }

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            StringBuilder re = new StringBuilder();
            re.append(en.getValue());
            re.append(" ");
            re.append(en.getKey());

            result.add(String.valueOf(re));

        }
        return result;
    }
}
public class ShortestEncodingWays {
}
class Solution820 {//5%

    public int minimumLengthEncoding(String[] words) {
        int n = words.length;
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (!words[j].equals("")) {
                        boolean flag = check(words[i], words[j]);
                        if (flag) {
                            words[j] = "";
                        }

                    } else {
                        break;
                    }
                }

            }


        }
        for (int i = 0; i < words.length; i++) {

            if (!words[i].equals("")) {
                char str[] = words[i].toCharArray();
                count += str.length + 1;
            }
        }
        return count;


    }

    public boolean check(String w1, String w2) {
        char s1[] = w1.toCharArray();
        char s2[] = w2.toCharArray();
        int n1 = s1.length;
        int n2 = s2.length;
        if (n2 > n1)
            return false;
        int m = n1 - 1;
        for (int i = n2 - 1; i >= 0; i--) {
            if (s2[i] != s1[m--])
                return false;
        }
        return true;
    }


}
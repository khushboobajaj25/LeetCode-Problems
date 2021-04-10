package LeetcodeProblems;

public class FindWordsThatCanBeFormedbyCharacters {
}

class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int n = words.length;
        char str[] = chars.toCharArray();
        int n1 = str.length;
        int count[] = new int[26];
        int length = 0;
        for (int i = 0; i < n1; i++) {
            count[str[i] - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int count_words[] = new int[26];
            char str1[] = words[i].toCharArray();
            int n2 = str1.length;
            for (int j = 0; j < n2; j++) {
                count_words[str1[j] - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                if (!(count[j] >= count_words[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                length += words[i].length();
            }

        }
        return length;
    }
}
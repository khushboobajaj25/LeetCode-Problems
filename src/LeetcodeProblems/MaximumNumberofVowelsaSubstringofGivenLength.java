package LeetcodeProblems;

public class MaximumNumberofVowelsaSubstringofGivenLength {
}

class Solution1456 {
    int vowel_count = 0;

    public int maxVowels(String s, int k) {
        int n = s.length();
        char str[] = s.toCharArray();
        int max = -1;
        for (int i = 0; i < n - k + 1; i++) {

            if (i + k > n) {
                break;
            }
            if (max == k) {
                return max;
            }


            if (i == 0) {


                for (int j = 0; j < i + k; j++) {
                    if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j] == 'o' || str[j] == 'u') {
                        vowel_count++;
                    }
                }
            } else {
                if (i != 0 && (str[i - 1] == 'a' || str[i - 1] == 'e' || str[i - 1] == 'i' || str[i - 1] == 'o' || str[i - 1] == 'u')) {
                    vowel_count--;
                }

                if (i + k - 1 < n) {
                    if (str[i + k - 1] == 'a' || str[i + k - 1] == 'e' || str[i + k - 1] == 'i' || str[i + k - 1] == 'o' || str[i + k - 1] == 'u') {
                        vowel_count++;
                    }
                }
            }
            if (vowel_count > max) {
                max = vowel_count;
                if (max == k) {
                    return max;
                }
            }

        }

        return max;
    }

}


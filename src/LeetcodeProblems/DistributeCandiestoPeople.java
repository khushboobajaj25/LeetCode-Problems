package LeetcodeProblems;

public class DistributeCandiestoPeople {
}

class Solution1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int count = 0;
        int result[] = new int[num_people];
        int candy = 1;
        while (count <= candies) {
            for (int i = 0; i < num_people; i++) {
                count += candy;
                if (count > candies) {
                    count -= candy;
                    result[i] += candies - count;
                    count += candy;
                    break;

                } else {
                    result[i] += candy;
                    candy++;
                }

            }
        }


        return result;
    }
}
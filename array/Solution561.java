package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        List<Integer> pair = new ArrayList<>();

        Arrays.sort(nums);

        for (int n : nums) {
            pair.add(n);
            if (pair.size() == 2) {
                sum += Math.min(pair.get(0), pair.get(1));
                pair.clear();
            }
        }
        return sum;
    }
}

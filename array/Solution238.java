package array;

public class Solution238 {
    public int[] exceptItself(int[] nums) {
        // [1, 3, 5, 7]
        int[] result = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = p;
            p *= nums[i];
        }

        p = 1;
        for (int i = nums.length - 1; i>=0; i--) {
            result[i] *= p;
            p *= nums[i];
        }
        return result;
    }
}

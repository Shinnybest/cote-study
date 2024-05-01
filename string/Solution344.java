package string;

public class Solution344 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            var temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        var example1 = new char[] { 'h', 'e', 'l', 'l', 'o' };
        Solution344 sol = new Solution344();
        sol.reverseString(example1);
    }
}

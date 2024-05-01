package string;

public class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        var original = sb.toString();
        var reversed = sb.reverse().toString();

        return original.equals(reversed);
        }
    public static void main(String[] args) {
        var example1 = "race a car";
        var example2 = "A man, a plan, a canal: Panama";
        Solution125 sol = new Solution125();
        System.out.println(sol.isPalindrome(example1));
        System.out.println(sol.isPalindrome(example2));
    }
}

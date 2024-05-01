package string;

public class Solution5 {
    // 틀림
    int maxNum = 0;
    String str = "";

    public void extendPalindrome(String s, int x, int y) {
        while (x>0 && y<s.length() && s.charAt(x) == s.charAt(y)) {
            x--;
            y++;
        }
        var a = y-x+1;
        if (a > maxNum) {
            str = s.substring(x, y+1);
            maxNum = a;
        }
    }

    public String longestPalindrome(String s) {

        if (s.length() < 2) return s;

        for (int i=0; i<s.length() - 1; i++) {
            extendPalindrome(s, i, i+1);
            extendPalindrome(s, i, i+2);
        }
        return str;
    }
}

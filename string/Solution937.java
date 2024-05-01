package string;

import java.util.ArrayList;
import java.util.List;

public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        // write your code here
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        letterLogs.sort((a, b) -> {
            var aSplit = a.split(" ", 2);
            var bSplit = b.split(" ", 2);
            var cmp = aSplit[1].compareTo(bSplit[1]);
            if (cmp == 0) {
                return aSplit[0].compareTo(bSplit[0]);
            } else {
                return cmp;
            }
        });

        letterLogs.addAll(digitLogs);

        return letterLogs.toArray(new String[0]);
    }

    public static void main(String[] args) {
        var logs = new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
        Solution937 sol = new Solution937();
        var result = sol.reorderLogFiles(logs);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

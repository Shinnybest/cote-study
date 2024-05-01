package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        var newBanned = Arrays.stream(banned).toList();
        Map<String, Integer> map = new HashMap<>();
        var words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String word : words) {
            if (!map.keySet().contains(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        var max = 0;
        var mostCommonWord = "";
        for (String key: map.keySet()) {
            if (map.get(key) > max && !newBanned.contains(key)) {
                mostCommonWord = key;
                max = map.get(key);
            } else {
                continue;
            }
        }
        return mostCommonWord;
    }

    public static void main(String[] args) {
        var paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        var banned = new String[] { "hit" };
        Solution819 solution819 = new Solution819();
        var result = solution819.mostCommonWord(paragraph, banned);
        System.out.println(result);
    }
}

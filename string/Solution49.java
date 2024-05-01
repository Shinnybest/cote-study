package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.*;

public class Solution49 {

    public List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            sort(charArray);
            String key = new String(charArray);
            if (!results.containsKey(key)) {
                results.put(key, new ArrayList<>());
            }
            results.get(key).add(str);
        }

        return new ArrayList<>(results.values());
    }

    public static void main(String[] args) {
        var example1 = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        Solution49 sol = new Solution49();
        var result = sol.groupAnagram(example1);
        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}

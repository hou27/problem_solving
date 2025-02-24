import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> sortedStrs = new HashMap<String, List<Integer>>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (sortedStrs.get(key) == null) {
                sortedStrs.put(key, new ArrayList<Integer>());
            }
            sortedStrs.get(key).add(i);
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for (List<Integer> idxs : sortedStrs.values()) {
            List<String> group = new ArrayList<String>();
            for (int idx : idxs) {
                group.add(strs[idx]);
            }
            result.add(group);
        }

        return result;
    }
}
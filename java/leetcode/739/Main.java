import java.util.*;

public class Main {

}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        List<int[]> tmp = new ArrayList<>();
        tmp.add(new int[] { temperatures[0], 0 });

        for (int i = 1; i < temperatures.length; i++) {

            int idx = 0;
            while (idx < tmp.size()) {
                if (temperatures[i] > tmp.get(idx)[0]) {
                    output[tmp.get(idx)[1]] = i - tmp.get(idx)[1];
                    tmp.remove(idx);
                } else {
                    idx++;
                }
            }

            tmp.add(new int[] { temperatures[i], i });
        }

        return output;
    }
}
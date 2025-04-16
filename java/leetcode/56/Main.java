import java.util.*;

public class Main {

}

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int ps = start;
        int pe = end;
        ArrayList<int[]> resultList = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (pe >= intervals[i][0]) {
                if (pe <= intervals[i][1])
                    pe = intervals[i][1];
            } else {
                resultList.add(new int[] { ps, pe });
                ps = intervals[i][0];
                pe = intervals[i][1];
            }

            if (i == intervals.length - 1) {
                resultList.add(new int[] { ps, pe });
            }
        }

        int[][] result = resultList.toArray(new int[resultList.size()][]);

        return result;
    }
}
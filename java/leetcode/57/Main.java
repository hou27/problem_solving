import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputIntervals = sc.next().replace("[", "").replace("]", "");
        String inputNewInterval = sc.next().replace("[", "").replace("]", "");
        List<int[]> intervals = new ArrayList<>();
        String[] intervalPairs = inputIntervals.split(",");
        for (int i = 0; i < intervalPairs.length; i += 2) {
            intervals.add(new int[] { Integer.parseInt(intervalPairs[i]), Integer.parseInt(intervalPairs[i + 1]) });
        }
        int[] newInterval = Arrays.stream(inputNewInterval.split(",")).mapToInt(Integer::parseInt).toArray();
        intervals.add(newInterval);

        sc.close();

        intervals.sort((o1, o2) -> o1[0] - o2[0]);

        int idx = 0;
        List<int[]> result = new ArrayList<>();
        int start;
        int end;
        while (idx < intervals.size()) {
            start = intervals.get(idx)[0];
            int currEnd = intervals.get(idx)[1];
            if (idx == intervals.size() - 1 || currEnd < intervals.get(idx + 1)[0]) {
                end = currEnd;
                idx++;
            } else {
                int startIdx = idx + 1;
                for (int i = startIdx; i < intervals.size(); i++) {
                    if (currEnd >= intervals.get(i)[0]) {
                        idx = i;
                        currEnd = currEnd > intervals.get(i)[1] ? currEnd : intervals.get(i)[1];
                    } else {
                        break;
                    }
                }
                end = currEnd;
                idx++;
            }
            result.add(new int[] { start, end });
        }

        // print result
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        System.out.println();
    }

}

// Real submission
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] updatedIntervals = new int[intervals.length + 1][2];
        System.arraycopy(intervals, 0, updatedIntervals, 0, intervals.length);
        updatedIntervals[intervals.length] = newInterval;

        Arrays.sort(updatedIntervals, (o1, o2) -> o1[0] - o2[0]);

        int idx = 0;
        List<int[]> result = new ArrayList<>();
        int start;
        int end;
        while (idx < updatedIntervals.length) {
            start = updatedIntervals[idx][0];
            int currEnd = updatedIntervals[idx][1];
            if (idx == updatedIntervals.length - 1 || currEnd < updatedIntervals[idx + 1][0]) {
                end = currEnd;
                idx++;
            } else {
                int startIdx = idx + 1;
                for (int i = startIdx; i < updatedIntervals.length; i++) {
                    if (currEnd >= updatedIntervals[i][0]) {
                        idx = i;
                        currEnd = currEnd > updatedIntervals[i][1] ? currEnd : updatedIntervals[i][1];
                    } else {
                        break;
                    }
                }
                end = currEnd;
                idx++;
            }
            result.add(new int[] { start, end });
        }

        return result.toArray(new int[result.size()][]);
    }
}
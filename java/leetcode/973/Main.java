import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] pointsWithDistance = new int[points.length][3];
        for (int i = 0; i < points.length; i++) {
            pointsWithDistance[i][0] = points[i][0];
            pointsWithDistance[i][1] = points[i][1];
            pointsWithDistance[i][2] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }

        Arrays.sort(pointsWithDistance, (o1, o2) -> o1[2] - o2[2]);

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i][0] = pointsWithDistance[i][0];
            result[i][1] = pointsWithDistance[i][1];
        }

        return result;
    }
}
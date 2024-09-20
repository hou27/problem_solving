import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        System.out.println(s.solution(routes));
        int[][] routes2 = {{-2,-1}, {1,2}, {-3,0}};
        System.out.println(s.solution(routes2));
        int[][] routes3 = {{0,0}, {0,0}, {2,2}};
        System.out.println(s.solution(routes3));
        int[][] routes4 = {{0,1}, {1,2}, {3,4}, {5,6}, {7,8}, {9,10}, {11,12}, {13,14}};
        System.out.println(s.solution(routes4));
        int[][] routes5 = {{-20,15},{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        System.out.println(s.solution(routes5));
        int[][] routes6 = {{-20,-15}, {-16,-10}, {-18,-13}, {-15,-11}};
        System.out.println(s.solution(routes6));
    }
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, (a, b) -> Integer.compare(a[0], b[0]));
        // System.out.println("After sorting");
        // System.out.println(Arrays.deepToString(routes));
        
        int currentSpot = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            // System.out.println(routes[i][0] + ", " + routes[i][1]);
            if (currentSpot >= routes[i][0]) {
                currentSpot = currentSpot < routes[i][1] ? currentSpot : routes[i][1];
            }
            else {
                answer++;
                currentSpot = routes[i][1];
            }
        }

        return answer;
    }
}

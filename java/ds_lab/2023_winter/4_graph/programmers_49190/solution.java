import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Coordinate {
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Coordinate) {
            Coordinate c = (Coordinate) obj;
            return this.x == c.x && this.y == c.y;
        }
        return false;
    }
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arrows = {6, 2, 4, 0, 6, 4, 4, 4, 4};
        System.out.println(s.solution(arrows));
        arrows = new int[] {6, 0, 3, 0, 5, 2, 6, 0, 3, 0, 5};
        System.out.println(s.solution(arrows));
        arrows = new int[] {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
        System.out.println(s.solution(arrows));
        arrows = new int[] {6, 2, 6, 2, 5};
        System.out.println(s.solution(arrows));
        arrows = new int[] {5, 2, 7, 1, 6, 3};
        System.out.println(s.solution(arrows));
    }
    public int solution(int[] arrows) {
        int answer = 0;
        int[] loc = {0, 0};
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

        Map<Coordinate, List<Coordinate>> visited = new HashMap<>();
        for (int i = 0; i < arrows.length; i++) {
            for (int j = 0; j < 2; j++) {
                int nx = loc[0] + dx[arrows[i]];
                int ny = loc[1] + dy[arrows[i]];
                Coordinate key = new Coordinate(loc[0], loc[1]);
                Coordinate value = new Coordinate(nx, ny);

                // 첫방문
                if (!visited.containsKey(value)) {
                    visited.put(value, new ArrayList<Coordinate>());
                    visited.get(value).add(key);
                    if (!visited.containsKey(key)) {
                        visited.put(key, new ArrayList<Coordinate>());
                        visited.get(key).add(value);
                    }
                    else {
                        visited.get(key).add(value);
                    }
                }
                // 재방문
                else {
                    if (!visited.get(value).contains(key)) {
                        visited.get(value).add(key);
                        if (!visited.containsKey(key)) {
                            visited.put(key, new ArrayList<Coordinate>());
                            visited.get(key).add(value);
                        }
                        else {
                            visited.get(key).add(value);
                        }
                        answer++;
                    }
                }
                loc[0] = nx;
                loc[1] = ny;
            }
        }

        return answer;
    }
}

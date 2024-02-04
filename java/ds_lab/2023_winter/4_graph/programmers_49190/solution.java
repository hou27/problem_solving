class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arrows = {6, 2, 4, 0, 6, 4, 4, 4, 4};
        System.out.println(s.solution(arrows));
        arrows = new int[] {6, 0, 3, 0, 5, 2, 6, 0, 3, 0, 5};
        System.out.println(s.solution(arrows));
        arrows = new int[] {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
        System.out.println(s.solution(arrows));
    }
    public int solution(int[] arrows) {
        int answer = 0;
        int size = arrows.length;
        int initialLocate = size;

        int[][] grid = new int[size * 2][size * 2];
        int[] loc = {initialLocate, initialLocate}; // 초기 좌표를 (initialLocate, initialLocate)로 설정
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

        grid[initialLocate][initialLocate] = 1;

        for (int i = 0; i < arrows.length; i++) {
            int nx = loc[0] + dx[arrows[i]];
            int ny = loc[1] + dy[arrows[i]];
            if (grid[nx][ny] == 0) {
                grid[nx][ny] = 1;
            }
            else {
                answer++;
            }
            loc[0] = nx;
            loc[1] = ny;
        }

        return answer;
    }
}
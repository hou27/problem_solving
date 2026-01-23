import java.io.*;
import java.util.Arrays;

public class Main2 {
    static int n, t;
    static long[][] grid;
    static long[][] dpStart;
    static long[][] dpEnd;
    static final long NEG = -(1L << 60);

    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        n = fs.nextInt();
        t = fs.nextInt();
        grid = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = fs.nextInt();
            }
        }

        dpStart = new long[n][n];
        dpEnd = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dpStart[i][j] = grid[i][j];
                    continue;
                }
                long best = NEG;
                if (i > 0)
                    best = Math.max(best, dpStart[i - 1][j]);
                if (j > 0)
                    best = Math.max(best, dpStart[i][j - 1]);
                dpStart[i][j] = best + grid[i][j];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 && j == n - 1) {
                    dpEnd[i][j] = grid[i][j];
                    continue;
                }
                long best = NEG;
                if (i + 1 < n)
                    best = Math.max(best, dpEnd[i + 1][j]);
                if (j + 1 < n)
                    best = Math.max(best, dpEnd[i][j + 1]);
                dpEnd[i][j] = best + grid[i][j];
            }
        }

        long answer = dpStart[n - 1][n - 1];
        int size = t + 1;
        long[] local = new long[size * size];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if ((n - 1 - r) + (n - 1 - c) < t)
                    continue;
                long seg = maxSegmentFrom(r, c, local, size);
                if (seg == NEG)
                    continue;
                long total = dpStart[r][c] + dpEnd[r][c] - grid[r][c] + seg;
                if (total > answer)
                    answer = total;
            }
        }

        System.out.println(answer);
    }

    private static long maxSegmentFrom(int r, int c, long[] local, int size) {
        Arrays.fill(local, NEG);
        local[0] = grid[r][c];

        for (int dr = 0; dr <= t; dr++) {
            for (int dc = 0; dc <= t; dc++) {
                if (dr == 0 && dc == 0)
                    continue;
                if (dr + dc > t)
                    continue;
                int nr = r + dr;
                int nc = c + dc;
                if (nr >= n || nc >= n)
                    continue;
                long best = NEG;
                if (dr > 0)
                    best = Math.max(best, local[(dr - 1) * size + dc]);
                if (dc > 0)
                    best = Math.max(best, local[dr * size + (dc - 1)]);
                if (best == NEG)
                    continue;
                local[dr * size + dc] = best + grid[nr][nc];
            }
        }

        long max = NEG;
        for (int dr = 0; dr <= t; dr++) {
            int dc = t - dr;
            int nr = r + dr;
            int nc = c + dc;
            if (nr >= n || nc >= n)
                continue;
            long val = local[dr * size + dc];
            if (val > max)
                max = val;
        }
        return max;
    }

    private static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr;
        private int len;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() {
            if (ptr >= len) {
                try {
                    len = in.read(buffer);
                    ptr = 0;
                } catch (IOException e) {
                    return -1;
                }
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}

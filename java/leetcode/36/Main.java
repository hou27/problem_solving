import java.util.*;

public class Main {

}

class Solution {
    int N = 9;

    public boolean isValidSudoku(char[][] board) {
        Set<String> appeared = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((board[i][j] != '.')
                        && (!appeared.add("i" + i + board[i][j])
                                || !appeared.add("j" + j + board[i][j])
                                || !appeared.add("region" + getRegion(N, i, j) + board[i][j]))) {
                    return false;
                }
            }
        }

        return true;
    }

    static int getRegion(int N, int i, int j) {
        int sizeOfSubBox = N / 3;
        int regionRow = i / sizeOfSubBox;
        int regionCol = j / sizeOfSubBox;
        return regionRow + regionCol * sizeOfSubBox;
    }
}
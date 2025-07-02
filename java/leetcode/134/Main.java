import java.util.*;

public class Main {

}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gl = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int[] remainGas = new int[gas.length];

        for (int i = 0; i < gas.length; i++) {
            remainGas[i] = gas[i] - cost[i];
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalCost > totalGas) {
            return -1;
        }

        int currGas = 0;
        int startIdx = 0;
        for (int i = 0; i < gas.length; i++) {
            currGas += gas[i] - cost[i];

            if (currGas < 0) {
                startIdx = i + 1;
                currGas = 0;
            }
        }

        return currGas < 0 ? -1 : startIdx;
    }
}
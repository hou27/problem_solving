import java.util.*;

public class Main {

}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
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

        int maxIndex = 0;
        for (int i = 1; i < remainGas.length; i++) {
            if (remainGas[i] > remainGas[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
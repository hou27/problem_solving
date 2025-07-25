import java.util.*;

public class Main {

}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {
                int prevIdx = stack.pop();
                output[prevIdx] = i - prevIdx;
            }
            stack.push(i);
        }

        return output;
    }
}
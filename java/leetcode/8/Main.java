import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

// Real submission
class Solution {
    public int myAtoi(String s) {
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;
        char[] charArr = s.toCharArray();
        int size = charArr.length;
        int i = 0;

        while (i < size && charArr[i] == ' ') {
            i++;
        }

        if (i == size) {
            return 0;
        }

        boolean negativeFlag = false;
        if (charArr[i] == '-') {
            negativeFlag = true;
            i++;
        } else if (charArr[i] == '+') {
            i++;
        } else {
            if (!Character.isDigit(charArr[i])) {
                return 0;
            }
        }

        int result = 0;

        while (i < size && Character.isDigit(charArr[i])) {
            int digit = charArr[i] - '0';
            if (result > (high - digit) / 10) {
                return negativeFlag ? low : high;
            }
            result = result * 10 + digit;
            i++;
        }

        if (negativeFlag) {
            result = -result;
        }

        return result;
    }
}
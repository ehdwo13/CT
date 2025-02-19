import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] result = new int[len];

        if (direction.equals("left")) {
            System.arraycopy(numbers, 1, result, 0, len - 1);
            result[len - 1] = numbers[0];
        } else {
            System.arraycopy(numbers, 0, result, 1, len - 1);
            result[0] = numbers[len - 1];
        }

        return result;
    }
}
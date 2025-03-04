import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        for (String str : strArr) {
            int length = str.length();
            lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
        }
        int maxGroupSize = 0;
        for (int count : lengthCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }
        return maxGroupSize;
    }
}

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
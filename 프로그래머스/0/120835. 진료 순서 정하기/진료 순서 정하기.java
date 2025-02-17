import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] sorted = Arrays.stream(emergency)
                                 .boxed()
                                 .toArray(Integer[]::new);
        Arrays.sort(sorted, Comparator.reverseOrder());
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rank.put(sorted[i], i + 1);
        }
        return Arrays.stream(emergency)
                     .map(e -> rank.get(e))
                     .toArray();
    }
}
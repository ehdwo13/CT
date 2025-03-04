import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }
        list.sort((a, b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            if (diffA == diffB) {
                return b - a; 
            }
            return diffA - diffB;
        });
        return list.stream().mapToInt(i -> i).toArray();
    }
}

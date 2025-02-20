import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] dice = {a, b, c, d};
        for (int num : dice) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        if (countMap.size() == 1) { 
            return 1111 * a;
        } else if (countMap.size() == 2) { 
            List<Integer> keys = new ArrayList<>(countMap.keySet());
            int x = keys.get(0), y = keys.get(1);
            
            if (countMap.get(x) == 3) {
                return (int) Math.pow(10 * x + y, 2);
            } else if (countMap.get(y) == 3) {
                return (int) Math.pow(10 * y + x, 2);
            } else { 
                return (x + y) * Math.abs(x - y);
            }
        } else if (countMap.size() == 3) { 
            int p = 0, q = 0, r = 0;
            for (int key : countMap.keySet()) {
                if (countMap.get(key) == 2) p = key;
                else if (q == 0) q = key;
                else r = key;
            }
            return q * r;
        } else { 
            return Arrays.stream(dice).min().getAsInt();
        }
    }
}

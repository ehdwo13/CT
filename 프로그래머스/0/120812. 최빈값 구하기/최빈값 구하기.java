import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int most = -1;
        boolean multiple = false;
        for(int num : array){
            int count = map.getOrDefault(num,0)+1;
            map.put(num, count);
            if(count > max){
                max = count;
                most = num;
                multiple = false;
            }else if(count == max){
                multiple = true;
            }
        }
        return multiple ? -1 : most;
    }
}
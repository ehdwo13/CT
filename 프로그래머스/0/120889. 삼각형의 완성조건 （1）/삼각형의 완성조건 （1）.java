import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = 0;
        for(int i=0; i<sides.length; i++){
            sum += sides[i];
        }
        return sum - max > max ? 1 : 2;
    }
}
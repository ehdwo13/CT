import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                index = i;
                break;
            }
        }
        
        return new int[]{max, index};
    }
}

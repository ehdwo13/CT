class Solution {
    public int solution(int[] array, int n) {
        int index = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - n); 
            if (currentDiff < diff || (currentDiff == diff && array[i] < array[index])) {
                diff = currentDiff;
                index = i;
            }
        }
        return array[index];
    }
}

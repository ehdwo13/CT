class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return ((max + min - 1) - (max + 1) + 1) + (max - (max - min + 1) + 1);
    }
}

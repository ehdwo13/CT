class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }
        return count;
    }
    private boolean isComposite(int num) {
        int divisorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount >= 3;
    }
}
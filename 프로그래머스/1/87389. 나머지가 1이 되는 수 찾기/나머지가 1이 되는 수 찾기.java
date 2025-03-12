class Solution {
    public int solution(int n) {
        int num = n - 1;
        for (int x = 2; x * x <= num; x++) {
            if (num % x == 0) {
                return x;
            }
        }
        return num;
    }
}

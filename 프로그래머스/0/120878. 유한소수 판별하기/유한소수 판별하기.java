class Solution {
    public int solution(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        b /= x;
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        return b == 1 ? 1 : 2;
    }
}

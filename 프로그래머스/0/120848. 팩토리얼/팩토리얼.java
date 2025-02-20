class Solution {
    public int solution(int n) {
        int answer = 1;
        while (factorial(answer) <= n) {
            answer++;
        }
        return answer - 1;
    }
    public long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}

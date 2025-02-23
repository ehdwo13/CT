class Solution {
    public int solution(int order) {
        int answer = 0;
        for (char ch : String.valueOf(order).toCharArray()) {
            int num = ch - '0';
            if (num != 0 && num % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}

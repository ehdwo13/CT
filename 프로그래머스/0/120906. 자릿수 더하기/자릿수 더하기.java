class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for(char ch : str.toCharArray()){
            sum += ch-'0';
        }
        return sum;
    }
}
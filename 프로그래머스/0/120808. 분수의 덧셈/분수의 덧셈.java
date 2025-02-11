class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = lcm(denom1, denom2);
        int sumNumer = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
        int gcd = gcd(sumNumer, lcm);
        int[] answer = {sumNumer / gcd, lcm / gcd};
        return answer;
    }
    public int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

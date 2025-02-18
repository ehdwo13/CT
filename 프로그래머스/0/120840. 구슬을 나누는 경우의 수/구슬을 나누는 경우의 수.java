import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger ballsFactorial = factorial(balls);
        BigInteger shareFactorial = factorial(share);
        BigInteger ballsMinusShareFactorial = factorial(balls - share);
        BigInteger result = ballsFactorial.divide(shareFactorial.multiply(ballsMinusShareFactorial));
        return result.intValue();
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
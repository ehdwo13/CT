import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine().trim());
            sb.append(findNextPrime(n)).append("\n");
        }
        System.out.print(sb);
    }

    public static long findNextPrime(long n) {
        if (n <= 1) return 2;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
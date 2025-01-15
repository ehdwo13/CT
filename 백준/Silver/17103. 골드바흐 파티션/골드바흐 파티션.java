import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int max = 1000000;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
    }
}

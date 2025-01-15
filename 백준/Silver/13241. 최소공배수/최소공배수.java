import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        long A =Long.parseLong(input.split(" ")[0]);
        long B =Long.parseLong(input.split(" ")[1]);
        System.out.println(lcm(A,B));
    }
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

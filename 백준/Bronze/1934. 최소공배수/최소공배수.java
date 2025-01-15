import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String input = br.readLine();
            int A =Integer.parseInt(input.split(" ")[0]);
            int B =Integer.parseInt(input.split(" ")[1]);
            System.out.println(lcm(A,B));
        }
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

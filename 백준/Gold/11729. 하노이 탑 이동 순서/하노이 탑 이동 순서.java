import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((1 << N) - 1).append('\n');
        hanoi(N, 1, 3, 2);
        System.out.print(sb);
    }
    private static void hanoi(int num, int from, int to, int other) {
        if (num == 1) {
            sb.append(from).append(' ').append(to).append('\n');
            return;
        }
        hanoi(num - 1, from, other, to);
        sb.append(from).append(' ').append(to).append('\n');
        hanoi(num - 1, other, to, from);
    }
}

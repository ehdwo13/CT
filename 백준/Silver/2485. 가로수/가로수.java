import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = Integer.parseInt(br.readLine());
        }
        int[] distances = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            distances[i] = positions[i + 1] - positions[i];
        }
        int gcd = distances[0];
        for (int i = 1; i < distances.length; i++) {
            gcd = gcd(gcd, distances[i]);
        }
        int totalTrees = 0;
        for (int distance : distances) {
            totalTrees += (distance / gcd) - 1;
        }
        System.out.println(totalTrees);
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
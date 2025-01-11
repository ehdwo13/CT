import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }
        int[] sorted = origin.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> rankingMap = new HashMap<>();
        int rank = 0;
        for (int v : sorted) {
            if (!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            sb.append(rankingMap.get(key)).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}

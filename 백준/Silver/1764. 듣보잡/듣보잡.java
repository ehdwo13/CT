import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> heard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            heard.add(br.readLine());
        }
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < M; i++) {
            seen.add(br.readLine());
        }
        heard.retainAll(seen);
        List<String> resultList = new ArrayList<>(heard);
        Collections.sort(resultList);
        System.out.println(resultList.size());
        for (String name : resultList) {
            System.out.println(name);
        }
    }
}

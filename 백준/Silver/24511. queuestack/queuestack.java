import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<String> queuestack = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        String type = br.readLine();
        String[] init = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            if (type.charAt(i*2) == '0') {
                queuestack.push(init[i]);
            }
        }
        int M = Integer.parseInt(br.readLine());
        for (String c : br.readLine().split(" ")) {
            queuestack.add(c);
            sb.append(queuestack.pop()).append(" ");
        }
        System.out.println(sb);
    }
}
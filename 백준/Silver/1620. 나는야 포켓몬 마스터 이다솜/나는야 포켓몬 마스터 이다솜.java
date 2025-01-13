import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nameToNumber = new HashMap<>();
        HashMap<Integer, String> numberToName = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNumber.put(name, i);
            numberToName.put(i, name);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            if (isNumeric(question)) {
                int number = Integer.parseInt(question);
                sb.append(numberToName.get(number)).append("\n");
            } else {
                sb.append(nameToNumber.get(question)).append("\n");
            }
        }
        System.out.print(sb);
    }
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
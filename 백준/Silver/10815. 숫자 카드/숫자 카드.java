import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        HashSet<Integer> cardSet = new HashSet<>();
        for (String card : cards) {
            cardSet.add(Integer.parseInt(card));
        }
        int M = Integer.parseInt(br.readLine());
        String[] queries = br.readLine().split(" ");
        for (String query : queries) {
            if (cardSet.contains(Integer.parseInt(query))) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

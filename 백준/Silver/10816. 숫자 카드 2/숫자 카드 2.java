import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        Map<Integer, Integer> cardCountMap = new HashMap<>();
        for (String card : cards) {
            int number = Integer.parseInt(card);
            cardCountMap.put(number, cardCountMap.getOrDefault(number, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        String[] queries = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String query : queries) {
            int queryNumber = Integer.parseInt(query);
            sb.append(cardCountMap.getOrDefault(queryNumber, 0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

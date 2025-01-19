import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        List<String> words = new ArrayList<>(wordCount.keySet());
        words.sort((o1, o2) -> {
            int freqCompare = wordCount.get(o2).compareTo(wordCount.get(o1));
            if (freqCompare != 0) return freqCompare;
            int lengthCompare = Integer.compare(o2.length(), o1.length());
            if (lengthCompare != 0) return lengthCompare;
            return o1.compareTo(o2);
        });
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}
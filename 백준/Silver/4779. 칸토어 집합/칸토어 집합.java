import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3, n);
            char[] cantorSet = new char[length];
            for (int i = 0; i < length; i++) {
                cantorSet[i] = '-';
            }
            createCantorSet(cantorSet, 0, length);
            System.out.println(new String(cantorSet));
        }
    }
    private static void createCantorSet(char[] cantorSet, int start, int length) {
        if (length == 1) {
            return;
        }
        int partLength = length / 3;
        for (int i = start + partLength; i < start + 2 * partLength; i++) {
            cantorSet[i] = ' ';
        }
        createCantorSet(cantorSet, start, partLength);
        createCantorSet(cantorSet, start + 2 * partLength, partLength);
    }
}

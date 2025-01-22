import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] stars = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                stars[i][j] = ' ';
            }
        }
        drawStars(stars, 0, 0, N);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(stars[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static void drawStars(char[][] stars, int x, int y, int n) {
        if (n == 1) {
            stars[x][y] = '*';
            return;
        }
        int size = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                drawStars(stars, x + i * size, y + j * size, size);
            }
        }
    }
}

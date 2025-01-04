import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] paper = new boolean[100][100];
        int totalArea = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int row = x; row < x + 10; row++) {
                for (int col = y; col < y + 10; col++) {
                    if (!paper[row][col]) {
                        paper[row][col] = true;
                        totalArea++;
                    }
                }
            }
        }
        System.out.println(totalArea);
    }
}

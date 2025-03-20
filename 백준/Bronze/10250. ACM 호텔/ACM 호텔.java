import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = bf.readLine().split(" ");
            int H = Integer.parseInt(arr[0]);
            int W = Integer.parseInt(arr[1]);
            int N = Integer.parseInt(arr[2]);
            int floor = N % H;
            int room = (N / H) + 1;
            if (floor == 0) {
                floor = H;
                room -= 1;
            }

            System.out.println(floor * 100 + room);
        }
    }
}

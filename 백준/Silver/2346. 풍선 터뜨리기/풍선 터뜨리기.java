import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] balloons = new int[n];
        for(int i = 0; i < n; i++) {
            balloons[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        boolean[] popped = new boolean[n];
        int index = 0;
        for(int count = 0; count < n; count++) {
            sb.append(index + 1).append(" ");
            popped[index] = true;
            int steps = balloons[index];
            if(count == n - 1) break;
            if(steps > 0) {
                for(int i = 0; i < steps; ) {
                    index = (index + 1) % n;
                    if(!popped[index]) i++;
                }
            }else{
                for(int i = 0; i < Math.abs(steps); ) {
                    index = (index - 1 + n) % n;
                    if(!popped[index]) i++;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}

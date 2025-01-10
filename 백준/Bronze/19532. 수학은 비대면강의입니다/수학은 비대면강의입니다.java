import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);
        for(int x = -999; x<=999; x++){
            for(int y = -999; y<=999; y++){
                if((a+d)*x + (b+e)*y == c+f && (a-d)*x + (b-e)*y == c-f){
                    System.out.print(x+" "+y);
                    return;
                }
            }
        }
    }
}

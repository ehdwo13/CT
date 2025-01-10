import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        for(int i=0; i<N; i++){
            int sum = i;
            int temp = i;

            while(temp > 0){
                sum += temp%10;
                temp /= 10;
            }
            if(sum == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
        bf.close();
    }
}

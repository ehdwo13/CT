import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String cardInput = bufferedReader.readLine();
        st = new StringTokenizer(cardInput);
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int nearSum = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= M && sum > nearSum){
                        nearSum = sum;
                    }
                }
            }
        }
        System.out.println(nearSum);
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}

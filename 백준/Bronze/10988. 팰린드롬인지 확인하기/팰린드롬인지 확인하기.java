import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder(word);
        String revWord = sb.reverse().toString();
        if(word.equals(revWord)){
            bw.write("1");
        }else{
            bw.write("0");
        }
        bw.flush();
    }
}

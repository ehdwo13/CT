import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = bf.readLine();
        String b = bf.readLine();
        String c = bf.readLine();
        bw.write(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c) + "\n");
        bw.write(Integer.parseInt(a + b) - Integer.parseInt(c) + "\n");
        bw.flush();
        bw.close();
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        System.out.println(Integer.parseInt(B, N));
    }
}

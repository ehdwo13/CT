import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int totalDistance = A-B;
        int days = (V-A)/totalDistance;
        if((V-A)%totalDistance != 0){
            days++;
        }
        days++;
        System.out.println(days);
    }
}

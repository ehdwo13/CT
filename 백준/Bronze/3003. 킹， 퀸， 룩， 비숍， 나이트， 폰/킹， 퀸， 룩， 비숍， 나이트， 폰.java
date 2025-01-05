import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        int[] correctArr = {1,1,2,2,2,8};
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int item : correctArr){
            int compare =Integer.parseInt(st.nextToken());
            System.out.print(item - compare+ " ");
        }
    }
}

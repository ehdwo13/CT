import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++){
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, ((o1, o2) ->  Integer.parseInt(o1[0]) - Integer.parseInt(o2[0])));
        for (String[] row : arr) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}

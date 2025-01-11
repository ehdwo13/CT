import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextLine();
        }
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr, (Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())));
        for(String item: arr){
            System.out.println(item);
        }
    }
}

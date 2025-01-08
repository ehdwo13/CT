import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        OptionalInt maxWidth = Arrays.stream(x).distinct().max();
        OptionalInt minWidth = Arrays.stream(x).distinct().min();
        OptionalInt maxHeight = Arrays.stream(y).distinct().max();
        OptionalInt minHeight = Arrays.stream(y).distinct().min();
        System.out.print((maxWidth.getAsInt()-minWidth.getAsInt())*(maxHeight.getAsInt()-minHeight.getAsInt()));
    }
}

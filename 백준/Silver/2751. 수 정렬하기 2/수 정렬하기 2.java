import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            arr.add(sc.nextInt());
        }
        arr = arr.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

        for(int item: arr){
            bw.write(item + "\n");
        }
        bw.flush();
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        HashSet<String> danced = new HashSet<>();
        danced.add("ChongChong");
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            String A = input[0];
            String B = input[1];
            if (danced.contains(A) || danced.contains(B)) {
                danced.add(A);
                danced.add(B);
            }
        }
        System.out.println(danced.size());
    }
}

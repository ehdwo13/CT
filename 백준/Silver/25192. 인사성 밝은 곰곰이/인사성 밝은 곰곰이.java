import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            String message = sc.nextLine();
            if(message.equals("ENTER")){
                sum += set.size();
                set.clear();
            }else{
                set.add(message);
            }
        }
        sum += set.size();
        System.out.println(sum);
    }
}

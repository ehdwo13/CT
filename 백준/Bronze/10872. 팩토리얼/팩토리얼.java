import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = 1;
        for(int i=1; i<=N; i++){
            x*=i;
        }
        System.out.println(x);
    }
}

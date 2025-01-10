import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;
        for(int i=0; i<=N/3; i++){
            for(int j=0; j<=N/5; j++){
                if(3*i + 5*j == N){
                    result = i+j;
                    break;
                }
            }
            if(result != -1){
                break;
            }
        }
        System.out.println(result);
    }
}
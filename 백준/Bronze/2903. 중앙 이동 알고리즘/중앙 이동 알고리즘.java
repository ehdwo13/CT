import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int init = 4;
        for(int i=0; i<N; i++){
            init = (int)Math.pow(Math.sqrt(init)+ Math.pow(2,i),2);
        }
        System.out.println(init);
    }
}

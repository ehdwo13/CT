import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 1;
        int accumulation = 1;
        while(true){
            if(accumulation>=N){
                System.out.print(start);
                break;
            }else{
                accumulation += 6*start;
                start++;
            }
        }
    }
}

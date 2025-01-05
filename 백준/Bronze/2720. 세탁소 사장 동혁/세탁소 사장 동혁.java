import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] coins = {25,10,5,1};
        while(T--> 0){
            int number = sc.nextInt();
            for(int coin : coins){
                System.out.print(number/coin + " ");
                number%=coin;
            }
            System.out.println();
        }
    }
}

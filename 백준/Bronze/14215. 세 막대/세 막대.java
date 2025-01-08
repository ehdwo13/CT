import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(sides);

        if(sides[2] >= sides[0] + sides[1]){
            System.out.print((sides[0] + sides[1])*2 -1);
        }else{
            int print = 0;
            for(int sum : sides){
                print += sum;
            }
            System.out.print(print);
        }
    }
}

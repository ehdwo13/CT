import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(true){
            if(X<= sum + count){
                if(count%2==0){
                    System.out.println((X-sum)+ "/"+(count-(X-sum-1)));
                }else{
                    System.out.println((count-(X-sum-1))+"/"+(X-sum));
                }
                break;
            }else{
                sum += count;
                count++;
            }
        }
    }
}

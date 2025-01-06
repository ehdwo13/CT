import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int sum = 0;
            int n = sc.nextInt();
            ArrayList<Integer>arrayList = new ArrayList<>();
            if(n == -1){
                break;
            }
            for(int i=1; i<n; i++){
                if(n%i==0){
                    sum += i;
                    arrayList.add(i);
                }
            }
            if (sum == n) {
                System.out.print(sum + " = ");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i));
                    if (i < arrayList.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }else{
                System.out.println(n +" is NOT perfect.");
            }
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] sides = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(sides); 

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break; 
            }
            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid"); 
            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral"); 
            } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
                System.out.println("Isosceles"); 
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
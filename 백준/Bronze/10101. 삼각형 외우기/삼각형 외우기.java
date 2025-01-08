import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x + y + z != 180) {
            System.out.print("Error");
        }
        else if (x == 60 && y == 60 && z == 60) {
            System.out.print("Equilateral");
        }
        else if (x == y || y == z || x == z) {
            System.out.print("Isosceles");
        }
        else {
            System.out.print("Scalene");
        }
    }
}

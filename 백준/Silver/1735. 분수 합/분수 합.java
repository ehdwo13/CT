import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int numerator = a * d + b * c;
        int denominator = b * d;
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;
        System.out.println(numerator + " " + denominator);
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

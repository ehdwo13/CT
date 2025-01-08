import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int fourthX = findUnique(x);
        int fourthY = findUnique(y);
        System.out.println(fourthX + " " + fourthY);
    }

    private static int findUnique(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        } else if (arr[0] == arr[2]) {
            return arr[1];
        } else {
            return arr[0];
        }
    }
}

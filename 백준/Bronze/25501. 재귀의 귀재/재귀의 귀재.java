import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            int[] count = {0};
            int result = isPalindrome(s, count);
            sb.append(result).append(" ").append(count[0]).append("\n");
        }
        System.out.print(sb);
    }
    public static int recursion(String s, int left, int right, int[] count) {
        count[0]++;
        if (left >= right) return 1;
        else if (s.charAt(left) != s.charAt(right)) return 0;
        else return recursion(s, left + 1, right - 1, count);
    }
    public static int isPalindrome(String s, int[] count) {
        return recursion(s, 0, s.length() - 1, count);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> line = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            line.add(sc.nextInt());
        }
        Stack<Integer> stack = new Stack<>();
        int expected = 1;
        while (!line.isEmpty()) {
            int current = line.poll();
            if (current == expected) {
                expected++;
            } else {
                stack.push(current);
            }
            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}

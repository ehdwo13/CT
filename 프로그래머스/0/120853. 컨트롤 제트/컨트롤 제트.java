import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (tmp.equals("Z")) {
                if (!stack.isEmpty()) {
                    sum -= stack.pop();
                }
            } else {
                int num = Integer.parseInt(tmp);
                sum += num;
                stack.push(num);
            }
        }
        return sum;
    }
}

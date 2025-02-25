class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split(" ");
        int a = Integer.parseInt(split[0]); 
        for (int i = 1; i < split.length; i += 2) {
            String operator = split[i];
            int number = Integer.parseInt(split[i + 1]);
            if (operator.equals("+")) {
                a += number;
            } else if (operator.equals("-")) {
                a -= number;
            }
        }
        return a;
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        for (char ch : String.valueOf(age).toCharArray()) {
            sb.append((char) ('a' + (ch - '0')));
        }
        return sb.toString();
    }
}
class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (ch < 'l') {
                result.append('l');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

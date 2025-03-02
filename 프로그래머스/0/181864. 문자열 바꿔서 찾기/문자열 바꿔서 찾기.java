class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else if (c == 'B') {
                sb.append('A');
            } else {
                sb.append(c);
            }
        }

        String convertedString = sb.toString();
    
        return convertedString.contains(pat) ? 1 : 0;
    }
}

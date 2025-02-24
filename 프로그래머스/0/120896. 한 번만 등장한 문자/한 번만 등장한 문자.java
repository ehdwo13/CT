class Solution {
    public String solution(String s) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(count[i] == 1) {
                sb.append((char)(i + 'a'));
            }
        }
        return sb.toString();
    }
}
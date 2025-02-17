class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            if (ch == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
                    sb.append(ch);
                }
            }
        }
        return sb.length() > 0 ? sb.toString() : "EMPTY";
    }
}
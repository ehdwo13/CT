class Solution {
    public String[] solution(String[] names) {
        String[] str = new String[(names.length + 4) / 5];
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                str[count++] = names[i];
            }
        }
        return str;
    }
}

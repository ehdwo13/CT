class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String target = Integer.toString(k);
        for (int num = i; num <= j; num++) {
            String strNum = Integer.toString(num);
            for (char ch : strNum.toCharArray()) {
                if (Character.toString(ch).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
}

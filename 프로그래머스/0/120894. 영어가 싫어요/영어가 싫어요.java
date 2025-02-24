class Solution {
    public long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0; i<10; i++){
            numbers = numbers.replace(str[i], num[i]);
        }
        return Long.parseLong(numbers);
    }
}
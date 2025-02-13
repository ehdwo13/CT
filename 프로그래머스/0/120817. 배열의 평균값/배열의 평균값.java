class Solution {
    public double solution(int[] numbers) {
        int sum=0;
        for(int item:numbers){
            sum+=item;
        }
        double answer = 0;
        answer = (double)sum/numbers.length;
        return answer;
    }
}
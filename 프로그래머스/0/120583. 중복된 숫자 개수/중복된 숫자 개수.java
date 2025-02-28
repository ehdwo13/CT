class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for(int num : array){
            if(n==num){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int solution(int[] array, int height) {
        int bigger = 0;
        for(int num : array){
            if(num>height){
                bigger++;
            }
        }
        return bigger;
    }
}
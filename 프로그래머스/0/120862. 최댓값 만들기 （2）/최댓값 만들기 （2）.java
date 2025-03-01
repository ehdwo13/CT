import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] sortArr = numbers.clone();
        Arrays.sort(sortArr);
        return Math.max(sortArr[0]*sortArr[1],sortArr[sortArr.length-1]*sortArr[sortArr.length-2]);
    }
}
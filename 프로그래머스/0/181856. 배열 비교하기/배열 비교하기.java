import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        if(arr1.length == arr2.length){
            return sum1 > sum2 ? 1 : sum1 == sum2 ? 0 : -1;
        }
        return arr1.length > arr2.length ? 1 : arr1.length == arr2.length ? 0 : -1;
    }
}
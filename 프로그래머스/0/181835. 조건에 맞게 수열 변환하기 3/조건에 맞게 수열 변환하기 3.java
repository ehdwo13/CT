class Solution {
     public int[] solution(int[] arr, int k) {
        if(k%2!=0){
            for(int i=0; i<arr.length; i++) {
                arr[i] = k * arr[i];
            }
        }else{
            for(int i=0; i<arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        }
        return arr;
    }
}
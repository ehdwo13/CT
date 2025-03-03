import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int count = arr[i];
            while(count != 0){
                arrayList.add(arr[i]);
                count--;
            }
        }
        return arrayList.stream().mapToInt(e->e).toArray();
    }
}
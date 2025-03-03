import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arrayList.contains(arr[i]) && arrayList.size() < k) {
                arrayList.add(arr[i]);
            }
        }
        while (arrayList.size() < k) {
            arrayList.add(-1);
        }

        return arrayList.stream().mapToInt(e -> e).toArray();
    }
}

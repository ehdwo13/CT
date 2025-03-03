import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int count = arr[i] * 2;
                for (int j = 0; j < count; j++) {
                    arrayList.add(arr[i]);
                }
            } else {
                int count = arr[i];
                int size = arrayList.size();
                if (size >= count) {
                    for (int j = size - 1; j >= size - count; j--) {
                        arrayList.remove(j);
                    }
                }
            }
        }
        return arrayList.stream().mapToInt(e -> e).toArray();
    }
}

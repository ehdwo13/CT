import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
                arrayList.add(i);
            }
        }
        if (count >= 2) {
            int start = Collections.min(arrayList);
            int end = Collections.max(arrayList);
            return Arrays.copyOfRange(arr, start, end + 1);
        } else if (count == 1) {
            int index = arrayList.get(0);
            return new int[]{arr[index]};
        }
        return new int[]{-1};
    }
}
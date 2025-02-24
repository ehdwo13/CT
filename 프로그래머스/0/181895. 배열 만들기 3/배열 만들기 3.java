import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                arrayList.add(arr[i]);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}

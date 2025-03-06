import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            boolean toDelete = false;
            for (int del : delete_list) {
                if (num == del) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) {
                arrayList.add(num);
            }
        }
        return arrayList.stream().mapToInt(e -> e).toArray();
    }
}

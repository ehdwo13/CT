import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++){
            arrayList.add(num_list[i]);
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
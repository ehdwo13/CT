import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                arrayList.add(todo_list[i]);
            }
        }
        return arrayList.toArray(new String[0]);
    }
}

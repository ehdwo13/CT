import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch)){
                arrayList.add(ch - '0');
            }
        }
        return arrayList.stream().mapToInt(i -> i).sorted().toArray();
    }
}
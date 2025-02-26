import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                arrayList.add(numlist[i]);
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
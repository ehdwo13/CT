import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%k==0){
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
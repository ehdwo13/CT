import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num>k){
                arrayList.add(num);
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(n != 1) {
            arrayList.add(n);
            n = Collatz(n);
        }
        arrayList.add(1);
        return arrayList.stream().mapToInt(i -> i).toArray();
    } 
    
    public int Collatz(int x){
        if(x % 2 == 0) return x/2;
        return 3*x + 1;
    }
}
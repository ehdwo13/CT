class Solution {
    public int[] solution(String[] strlist) {
        int[] arr = new int[strlist.length];
        for(int i=0; i<strlist.length; i++){
            String tmp = strlist[i];
            arr[i] = tmp.length();
        }
        return arr;
    }
}
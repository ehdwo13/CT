class Solution {
    public String solution(int n) {
        int count = n/2;
        int last = n%2;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append("수박");
            
        }
        if(last == 1){
                sb.append("수");
            }
        return sb.toString();
    }
}
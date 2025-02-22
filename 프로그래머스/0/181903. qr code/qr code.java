class Solution {
    public String solution(int q, int r, String code) {
        char[] ch = code.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ch.length; i++){
            if(i%q == r){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
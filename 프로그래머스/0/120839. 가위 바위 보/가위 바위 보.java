class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(char ch : rsp.toCharArray()){
            if (ch == '2') {
                sb.append('0');
            }else if (ch == '0'){
                sb.append('5');
            }else{
                sb.append('2');
            }
        }
        return sb.toString();
    }
}
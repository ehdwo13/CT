class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char ch : my_string.toCharArray()){
            if(index == n){
                break;
            }else{
                sb.append(ch);
                index++;
            }
        }
        return sb.toString();
    }
}
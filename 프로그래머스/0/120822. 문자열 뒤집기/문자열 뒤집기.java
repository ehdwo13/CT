class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< my_string.length(); i++){
            sb.append(my_string.toCharArray()[my_string.length()-i-1]);
        }
        return sb.toString();
    }
}
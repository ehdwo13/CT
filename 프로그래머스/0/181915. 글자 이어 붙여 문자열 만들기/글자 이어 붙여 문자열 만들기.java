class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        for(int i=0; i<index_list.length; i++){
            sb.append(ch[index_list[i]]);
        }
        return sb.toString();
    }
}
class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(char c : s.toCharArray()){
            if(c=='y' || c=='Y'){
                y++;
            }else if(c=='p' || c=='P'){
                p++;
            }
        }
        return p==y;
    }
}
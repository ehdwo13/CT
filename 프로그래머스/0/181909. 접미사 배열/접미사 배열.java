import java.util.*;

class Solution {
    public String[] solution(String my_string) { 
        String[] suffixArray = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            suffixArray[i] = my_string.substring(i);
        }
        Arrays.sort(suffixArray);
        return suffixArray;
    }
}

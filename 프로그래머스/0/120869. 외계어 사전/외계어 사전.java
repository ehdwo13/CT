import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] spellArr = String.join("", spell).toCharArray();
        Arrays.sort(spellArr);
        String target = new String(spellArr); 
        for (String word : dic) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            if (new String(wordArr).equals(target)) {
                return 1; 
            }
        }
        return 2;
    }
}

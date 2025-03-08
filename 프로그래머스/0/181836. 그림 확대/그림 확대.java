import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> pictureList = new ArrayList<>();
        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            for (char c : row.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                pictureList.add(sb.toString());
            }
        }
        return pictureList.toArray(new String[0]);
    }
}
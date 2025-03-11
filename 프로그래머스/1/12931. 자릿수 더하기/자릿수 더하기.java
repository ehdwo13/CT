import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] arr = String.valueOf(n).split("");
        int answer = 0;
        for(String str : arr){
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public long solution(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        return Long.parseLong(sb.toString());
    }
}
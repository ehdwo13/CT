import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String sorted = Arrays.stream(arr)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.joining());
        return sorted;
    }
}

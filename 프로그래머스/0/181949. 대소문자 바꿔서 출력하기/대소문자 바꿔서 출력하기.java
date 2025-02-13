import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringTokenizer st = new StringTokenizer(a);
        StringBuilder sb = new StringBuilder();
        for(char x : a.toCharArray()){
            if(Character.isLowerCase(x)){
                sb.append(Character.toUpperCase(x));
            }else{
                sb.append(Character.toLowerCase(x));
            }
        }
        System.out.println(sb);
    }
}
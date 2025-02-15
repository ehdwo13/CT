class Solution {
    public int solution(int a, int b) {
        return (a+""+b).compareTo(b+""+a) > 0 ? Integer.parseInt(a+""+b) :Integer.parseInt(b+""+a);
    }
}
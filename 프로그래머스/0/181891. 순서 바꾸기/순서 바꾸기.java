class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] result = new int[length];
        System.arraycopy(num_list, n, result, 0, length - n);
        System.arraycopy(num_list, 0, result, length - n, n);
        return result;
    }
}

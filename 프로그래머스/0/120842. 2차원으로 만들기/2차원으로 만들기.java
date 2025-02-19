class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length / n;
        int[][] result = new int[row][n];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j];
            }
        }
        return result;
    }
}
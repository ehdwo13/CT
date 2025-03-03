class Solution {
    public int solution(int[][] lines) {
        int[] lineMap = new int[201];
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int i = start; i < end; i++) {
                lineMap[i]++;
            }
        }
        int overlapLength = 0;
        for (int count : lineMap) {
            if (count > 1) {
                overlapLength++;
            }
        }
        return overlapLength;
    }
}

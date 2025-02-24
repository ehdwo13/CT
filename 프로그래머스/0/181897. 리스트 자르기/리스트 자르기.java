import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];

        if (n == 1) return Arrays.copyOfRange(num_list, 0, b + 1);
        if (n == 2) return Arrays.copyOfRange(num_list, a, num_list.length);
        if (n == 3) return Arrays.copyOfRange(num_list, a, b + 1);

        int size = (b - a) / c + 1;
        int[] result = new int[size];

        for (int i = 0, idx = a; idx <= b; i++, idx += c) {
            result[i] = num_list[idx];
        }

        return result;
    }
}

import java.util.Scanner;

public class Main {
    static int[] array, temp;
    static int count = 0;
    static int result = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        array = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        mergeSort(0, n - 1, k);
        System.out.println(result);
    }

    public static void mergeSort(int left, int right, int k) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid, k);
            mergeSort(mid + 1, right, k);
            merge(left, mid, right, k);
        }
    }

    public static void merge(int left, int mid, int right, int k) {
        int i = left;
        int j = mid + 1;
        int t = left;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = array[i++];
        }
        while (j <= right) {
            temp[t++] = array[j++];
        }
        for (int p = left; p <= right; p++) {
            array[p] = temp[p];
            count++;
            if (count == k) {
                result = array[p];
            }
        }
    }
}

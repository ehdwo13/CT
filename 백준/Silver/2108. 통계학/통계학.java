import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
        System.out.println(mid(arr));
        System.out.println(countMax(arr));
        System.out.println(range(arr));
    }
    public static int sum(int[] arr) {
        double sum = Arrays.stream(arr).sum();
        return (int) Math.round(sum / arr.length);
    }
    public static int mid(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
    public static int countMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int[] frequency = new int[max - min + 1];
        for (int num : arr) {
            frequency[num - min]++;
        }
        int maxFreq = Arrays.stream(frequency).max().getAsInt();
        int[] maxFreqValues = Arrays.stream(arr)
                .distinct()
                .filter(num -> frequency[num - min] == maxFreq)
                .sorted()
                .toArray();
        return maxFreqValues.length > 1 ? maxFreqValues[1] : maxFreqValues[0];
    }
    public static int range(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return max - min;
    }
}

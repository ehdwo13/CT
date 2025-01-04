import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for(int i=0; i<5; i++){
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (arr[row][col] != '\0') {
                    result.append(arr[row][col]);
                }
            }
        }
        System.out.println(result.toString());
    }
}

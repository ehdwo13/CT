import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                array[i][j]= sc.nextInt();
            }
        }
        for(int[] i : array){
            for(int j : i){
                if(j>max){
                    max = j;
                }
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(array[i][j] == max){
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);

    }
}

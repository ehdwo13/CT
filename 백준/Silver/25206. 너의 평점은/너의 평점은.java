import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double totalScore = 0;

        for(int i=0; i<20; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gradePoint = getGradePoint(grade);
            if(gradePoint != -1){
                total += score;
                totalScore +=score*gradePoint;
            }
        }
        double finalResult = total == 0? 0: totalScore/total;

        System.out.print(finalResult);
    }
    private static double getGradePoint(String grade){
        switch (grade){
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F" : return 0.0;
            case "P" : return -1;
            default : return 0.0;
        }
    }
}

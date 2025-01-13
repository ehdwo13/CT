import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("leave")){
                map.remove(name);
            }else{
                map.put(name, status);
            }
        }
        List<String> names = new ArrayList<>(map.keySet());
        names.sort(Collections.reverseOrder());
        for (String name : names) {
            System.out.println(name);
        }
    }
}
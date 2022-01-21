
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class f017 {

    public static void solve(String str) {
       char w[] = str.toCharArray();
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]);
            if(i <= w.length-2){
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solve(input);
    }

}

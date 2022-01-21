
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c186 {

     static void solve(String w[]){
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
    }
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String w[] = in.split("\\s+");
        if (w[0].equals("0") && w[1].equals("0")) {
            System.exit(0);
        }
        solve(w);
    }
    
}

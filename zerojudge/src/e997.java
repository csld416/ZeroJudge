
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e997 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void solve(String s, int n){
        String w[] = s.split("\\s+");
        System.out.println(w[w.length-n]);
    }
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        solve(s, n);
    }

}

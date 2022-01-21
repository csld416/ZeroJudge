
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c929 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s, String key) {
        String w[] = s.split(key);
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        String key = br.readLine();
        String s = br.readLine();
        solve(s, key);
    }

}

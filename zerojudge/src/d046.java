
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d046 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s, int n) {
        String w[] = s.split("\\s");
        int count = 0;
        for (int i = 0; i < w.length; i++) {
            if(Integer.parseInt(w[i]) <= 10){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        solve(s, n);
    }

}

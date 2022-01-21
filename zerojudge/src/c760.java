
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c760 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        for (int i = 0; i < w.length; i++) {
            char tmp = w[i].toUpperCase().charAt(0);
            System.out.print(tmp);
            System.out.print(w[i].substring(1));
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class a884 {

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        BigInteger a = new BigInteger(w[0]);
        BigInteger b = new BigInteger(w[1]);
        System.out.println(a.subtract(b));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            solve(s);
        }

    }

}

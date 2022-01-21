
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class b513 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {

        BigInteger bg = new BigInteger(s);
        if (bg.isProbablePrime(1)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

    }

    public static void main(String[] args) throws IOException {
        // while (true) {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            solve(s);
        }

        //}
    }

}

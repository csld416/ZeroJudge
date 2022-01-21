
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b112 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(BigInteger[] b) {
        BigInteger gcd = b[0];
        for (int i = 0; i < b.length; i++) {
            gcd = gcd.gcd(b[i]);
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            BigInteger b[] = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                b[i] = new BigInteger(sc.nextLine());
            }
            solve(b);
        }

    }

}

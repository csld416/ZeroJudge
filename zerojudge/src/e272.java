
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e272 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a, int b) {
        int gcd = gcd(a, b);
        BigInteger fb[] = new BigInteger[gcd+1];
        fb[0] = BigInteger.ONE;
        fb[1] = BigInteger.ONE;
        for (int i = 2; i < gcd+1; i++) {
            fb[i] = fb[i - 2].add(fb[i - 1]);
        }

        System.out.println(fb[gcd]);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b > a) {
                a ^= b;
                b ^= a;
                a ^= b;
            }
            solve(a, b);
        }
    }

}

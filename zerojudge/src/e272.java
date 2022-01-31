
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e272 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n, int m) {
        double f = Math.sqrt(5);
        n = (int) ((Math.pow(1+5, n)) - (Math.pow(1-5, n))/(Math.pow(2, n)*f));        
        m = (int) ((Math.pow(1+5, m)) - (Math.pow(1-5, m))/(Math.pow(2, m)*f));
        System.out.println(gcd(n,m));
    }

    static long gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            solve(a, b);
        }
    }

}

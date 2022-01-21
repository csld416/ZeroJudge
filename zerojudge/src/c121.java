
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class c121 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) {
        BigInteger f[] = new BigInteger[n];
        f[0] = new BigInteger("1");
        f[1] = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1].add(f[i - 2]);
        }
        System.out.println("The Fibonacci number for " + n + " is " + f[n - 1]);

    }

    public static void main(String[] args) throws IOException {
        //int n = Integer.parseInt(br.readLine());
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            solve(n);

        }
    }

}

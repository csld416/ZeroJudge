
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class a216 {

    final static Scanner sc = new Scanner(System.in);

    public static void solve(int n) {
        long f[] = new long[n];
        long g[] = new long[n];
        g[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i-1] += j;
            }
            for (int j = 1; j < i; j++) {
                g[j] = g[j-1] + f[j];
            }
        }
        System.out.println(f[n-1] +  " " + g[n-1]);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            solve(n);
        }
    }

}

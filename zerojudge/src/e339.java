
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class e339 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n, String s) {
        String w[] = s.split("\\s");
        BigInteger a[] = new BigInteger[w.length];
        for (int i = 0; i < w.length; i++) {
            a[i] = new BigInteger(w[i]);
        }
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            sum = sum.add(a[i]);
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        solve(n, s);
    }

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e417 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int[] a) {
        int n = a.length;
        BigInteger sum = BigInteger.ZERO;
         BigInteger two = BigInteger.ZERO;
         BigInteger split = new BigInteger("2");
        for (int i = 0; i < n; i++) {
            sum  = sum.add(BigInteger.valueOf(a[i]));
            two = two.add(BigInteger.valueOf((long)Math.pow(a[i], 2)));
        }
        sum = sum.pow(2);
        BigInteger ans = (sum.subtract(two)).divide(split);
        System.out.println(ans);
        
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a);
        }
    }

}

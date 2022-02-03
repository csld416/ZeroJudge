import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class f988 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static long k = (long) (Math.pow(10, 18) + 7);
	static BigInteger m = new BigInteger(Long.toString(k));

	public static void solve(long n, long r) {
		// C a catch b (mod 10^8+7)
		BigInteger a = fac(n);
		BigInteger b = (fac(r));
		BigInteger c = (fac(n-r));
		System.out.println((a.divide(b.multiply(c))).mod(m));
	}

	public static BigInteger fac(long n) {
		BigInteger ans = BigInteger.ONE;
		for (long i = 1; i < n; i++) {
			BigInteger tmp = new BigInteger(Long.toString(i));
			ans = ans.multiply(tmp);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			String w[] = s.split("\\s");
			long a = Long.parseLong(w[0]);
			long b = Long.parseLong(w[1]);
			solve(a, b);
		}
	}

}

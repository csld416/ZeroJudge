import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e351 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		BigInteger a = new BigInteger(w[0]);
		BigInteger b = new BigInteger(w[1]);
		long m = Long.parseLong(w[0]);
		long n = Long.parseLong(w[1]);
		System.out.println(rangeBitwiseAnd(m, n));
	}

	public static long rangeBitwiseAnd(long m, long n) {
		long ans = 0;
		for (int i = 31; i >= 0; i--) {
			if ((m & (1 << i)) == (n & (1 << i)))
				ans += (m & (1 << i));
			else
				break;
		}
		return ans;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

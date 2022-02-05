import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class d672 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static BigInteger in;
	static BigInteger nine = new BigInteger("9");
	static int m = 0;

	public static void solve() {
		m = 0;
		if (in.mod(nine).equals(BigInteger.ZERO)) {
			int y = count(in);
			System.out.println(in + " is a multiple of 9 and has 9-degree " + m + ".");
		} else {
			System.out.println(in + " is not a multiple of 9.");
		}
	}

	public static int count(BigInteger n) {
		m++;
		String s = n.toString();
		String w[] = s.split("");
		int sum = 0;
		for (int i = 0; i < w.length; i++) {
			sum += (Integer.parseInt(w[i]));
		}
		if (sum == 9) {
			return 1;
		}
		return count(BigInteger.valueOf(sum));

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			in = sc.nextBigInteger();
			if (in.equals(BigInteger.ZERO)) {
				System.exit(0);
			}
			solve();
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class a289 {
	static PrintWriter out = new PrintWriter(System.out);
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int a_, _n;

	public static void solve() {
		int answer = modInverse(a_, _n);
		if (answer > 0) {
			while (answer < 0) {
				answer += _n;
			}

			out.append(answer % _n + "");
		} else {
			out.append("No Inverse\n");
		}
		out.flush();
	}

	static int __gcd(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0)
			return 0;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return __gcd(a - b, b);

		return __gcd(a, b - a);
	}

	public static int modInverse(int a, int n) {
		for (int i = 1; i < n; i++) {
			if ((a * i % n) % n == 1) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			a_ = sc.nextInt();
			_n = sc.nextInt();
			solve();
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d575 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static long r, x, y, a, b;

	public static void solve() {
		long n = Math.abs(x - a);
		long m = Math.abs(y - b);
		System.out.println(n+m > r ? "alive" : "die");

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			x = sc.nextLong();
			y = sc.nextLong();
			a = sc.nextLong();
			b = sc.nextLong();
			r = sc.nextLong();
			solve();
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e357 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		System.out.println(f(n));
	}

	public static long f(int n) {
		if (n == 1) {
			return 1;
		} else if (n % 2 == 0) {
			return f(n / 2);
		} else {
			return f(n - 1) + f(n + 1);
		}
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}

	}

}

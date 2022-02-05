import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d255 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int i, j;

	public static void solve(int N) {
		long G = 0;
		for (i = 1; i < N; i++) {
			for (j = i + 1; j <= N; j++) {
				G += GCD(i, j);
			}
		}
		System.out.println(G);
	}

	public static long GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return a % b == 0 ? b : GCD(b, a % b);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			solve(n);
		}
	}

}

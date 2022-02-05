import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d658 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int kase = 1;

	public static void solve(int n) {
		int ans = 0;
		// 1 1+1 1+2
		for (int i = 0; i <= 14; i++) {
			if (Math.pow(2, i) >= n) {
				ans = i;
				break;
			}
		}
		System.out.println("Case " + kase + ": " + ans);
		kase++;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n < 0) {
				System.exit(0);
			}
			solve(n);
		}
	}

}

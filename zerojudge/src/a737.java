import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class a737 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {
		int n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		Arrays.sort(num);
		int mid;
		if (n % 2 == 1) {
			mid = num[n >> 1];
		} else {
			mid = (num[n >> 1] + num[(n >> 1) - 1]) >> 1;
		}
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			ans += Math.abs(num[i] - mid);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (sc.hasNext()) {
			solve();
		}
	}

}

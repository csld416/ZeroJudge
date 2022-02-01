import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d637 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] cost = new int[10001];
	static int[] weight = new int[10001];
	static int[] c = new int[101];
	static int n = 1;
	public static void solve() {
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 100; j >= weight[i]; j--) {
				c[j] = Math.max(c[j], c[j - weight[i]] + cost[i]);
			}
		}
		System.out.println(c[100]);
	}

	public static void main(String[] args) {
		 n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			weight[i] = sc.nextInt();
			cost[i] = sc.nextInt();
		}
		solve();
	}

}

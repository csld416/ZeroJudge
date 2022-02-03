import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a417 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int k, n, m;
	static int table[][] = new int[100][100];

	public static void solve() {
		int now = 1;
		int end = n * n;
		int sr = 0;
		int sc = -1;
		int er = n - 1;
		int ec = n - 1;
		int i, j;
		while (now <= end) {
			for (j = ++sc; j <= ec; j++) {
				table[sr][j] = now++;
			}
			for (i = ++sr; i <= er; i++) {
				table[i][ec] = now++;
			}
			for (j = --ec; j >= sc; j--) {
				table[er][j] = now++;
			}
			for (i = --er; i >= sr; i--) {
				table[i][sc] = now++;
			}
		}
		if (m == 1) {
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					System.out.printf("%5d", table[i][j]);
				}
				System.out.println();
			}
		} else {
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					System.out.printf("%5d", table[j][i]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		k = sc.nextInt();
		while (k-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			solve();
		}
	}

}

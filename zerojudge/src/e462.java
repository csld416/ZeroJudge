import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e462 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int n;

	public static void solve(int ans[][]) {
		int x = 1;
		for (int i = 0; i <= (n - 1) * 2; i++) {
			if (i <= (n - 1)) {
				for (int j = 0; j <= i; j++) {
					if ((i) % 2 == 0) {
						ans[i - j][j] = x;
						x++;
					} else if ((i) % 2 == 1) {
						ans[j][i - j] = x;
						x++;
					}
				}
			} else {
				for (int j = (n - 1); j > (i - n); j--) {
					if ((i) % 2 == 0) {
						ans[j][i - j] = x;
						x++;
					} else if ((i) % 2 == 1) {
						ans[i - j][j] = x;
						x++;
					}
				}

			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			n = sc.nextInt();
			int ans[][] = new int[n][n];
			solve(ans);
		}
	}

}

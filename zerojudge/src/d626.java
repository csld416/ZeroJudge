import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d626 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static char a[][] = new char[110][110];
	static int n = 0;

	public static void dfs(int x, int y) {
		if (x >= 0 && y >= 0 && x <= n && y <= n && a[x][y] == '-') {
			a[x][y] = '+'; // 上色
			dfs(x, y + 1); // 往下方探索 ↓
			dfs(x, y - 1); // 往上方探索 ↑
			dfs(x + 1, y); // 往右方探索 →
			dfs(x - 1, y); // 往左方探索 ←

		}
	}

	public static void main(String[] args) {
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		String input = sc.nextLine();
		String g[] = input.split("\\s");
		int x = Integer.parseInt(g[0]);
		int y = Integer.parseInt(g[1]);
		dfs(x, y);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

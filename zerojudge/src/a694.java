import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class a694 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);

	public static void solve(int[][] food, int[][] eat, int m) {
		int x = 0, y = 0;
		int ans[] = new int[m];
		for (int l = 0; l < m; l++) {
			x = eat[l][2] - eat[l][0] + 1;// width
			y = eat[l][3] - eat[l][1] + 1;// length
			int cc = 0, dd = 0;// initial position
			cc = eat[l][0] - 1;
			dd = eat[l][1] - 1;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					ans[l] = ans[l] + food[i + cc][j + dd];
				}
			}
			System.out.println(ans[l]);
		}
	}

	public static int sumOf2dArray(int[][] a, int width) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < width; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int food[][] = new int[n][n];
			int eat[][] = new int[m][4];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					food[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < 4; j++) {
					eat[i][j] = sc.nextInt();
				}
			}
			solve(food, eat, m);
		}
		out.close();
	}

	static class InputReader {
		BufferedReader br;

		public InputReader(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream));
		}

		public int nextInt() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = br.read();
			}
			int x = 0;
			while (c > 32) {
				x = x * 10 + c - '0';
				c = br.read();
			}
			return negative ? -x : x;
		}

		public long nextLong() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = br.read();
			}
			long x = 0;
			while (c > 32) {
				x = x * 10 + c - '0';
				c = br.read();
			}
			return negative ? -x : x;
		}

		public String next() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			StringBuilder sb = new StringBuilder();
			while (c > 32) {
				sb.append((char) c);
				c = br.read();
			}
			return sb.toString();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
	}
}
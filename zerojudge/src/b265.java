import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class b265 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);

	public static void solve(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int temp[] = new int[5];
			for (int j = 0; j < 5; j++) {
				temp[j] = a[i][j];
			}
			Arrays.sort(temp);
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < 5; k++) {
					a[i][k] = temp[k];
				}
			}
			// ==========

		}
		String ss[] = new String[a.length];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = "";
		}
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2 < 5; j2++) {
				ss[j] += Integer.toString(a[j][j2]);
			}
		}
		Arrays.sort(ss);
		int sum[] = new int[ss.length];
		for (int i = 1; i < ss.length; i++) {
			String temp = ss[i];
			if (temp.equals(ss[i - 1])) {
				sum[i]++;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			int a[][] = new int[n][5];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < 5; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			solve(a);
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

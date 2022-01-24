import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class a417 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);
	public static void solve(int n , int m) {
		int a[][] = new int[n][n];
		a[0][0] =1;
		if(m == 1) {
			a[n-1][n-1] = 2*n-1;
			int as = 2*a[n-1][n-1];
			a[1][1] = as-1;
			for (int i = 0; i < a.length; i++) {
				a[0][i] = i+1;
			}
			for (int i = 1; i < a.length; i++) {
				a[i][0] = as - a[0][i];
			}
			for (int i = 1; i < a.length; i++) {
				a[i][a.length-1] = a[i-1][a.length-1]++;
			}
		}else {
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print("     " + a[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		int t = read.nextInt();
		while(t-- > 0) {
			int n = read.nextInt();
			int m = read.nextInt();
			solve(n,m);
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
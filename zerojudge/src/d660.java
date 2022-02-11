import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class d660 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int n, r, kase = 1, i, up, down;

	public static void solve(int a[]) {
		up = 0;
		down = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				up++;
			} else if (a[i] > a[i + 1]) {
				down++;
			}
		}

		out.append("Case " + kase + ": " + up + " " + down + "");
		out.append("\n");
		out.flush();
		kase++;
	}

	public static void main(String[] args) throws Throwable {
		n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			r = Integer.parseInt(sc.nextLine());
			int a[] = new int[r];
			for (i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			solve(a);
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public boolean hasNext(String s) throws Throwable {
			return (s = sc.nextLine()) != null && s.length() != 0;
		}
	}
}

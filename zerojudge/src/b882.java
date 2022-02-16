import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class b882 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static long a, b, c;

	public static void solve() {
		b += c / 60;
		c %= 60;

		a += b / 60;
		b %= 60;

		if (a >= 24) {
			a %= 24;
		}
		StringBuilder a1, b1, c1;
		a1 = new StringBuilder(Long.toString(a));
		b1 = new StringBuilder(Long.toString(b));
		c1 = new StringBuilder(Long.toString(c));
		if (a < 10) {
			 a1 = a1.insert(0, "0");
		}
		if (b < 10) {
			 b1 = b1.insert(0, "0");
		}
		if (c < 10) {
			 c1 = c1.insert(0, "0");
		}
		out.append(a1 + ":" + b1 + ":" + c1 + "\n");
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		solve();
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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class d385 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int n;

	public static void solve(String w[]) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(w);
		for (int i = w.length - 1; i > -1; i--) {
			if (w[i].equals("9")) {
				sb.insert(0, w[i]);
			} else {
				sb.append(w[i]);
			}
		}
		out.append(sb + "\n");
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			String a[] = new String[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.next();
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

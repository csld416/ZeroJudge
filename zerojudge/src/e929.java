import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class e929 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int power;

	public static void solve(int n) {
		for (int i = 2; i <= n; i++) {
			if (n == 1) {
				out.append("\n");
				break;
			}
			power = 0;
			while (n % i == 0) {
				power++;
				n = n / i;
			}
			if (power > 1) {
				out.append(i + "^" + power);
				if (n > 1) {
					out.append(" * ");
				}
			} else if (power == 1) {
				out.append(i + "");
				if (n > 1) {
					out.append(" * ");
				}
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		String s = "";
		while ((s = sc.nextLine()) != null && s.length() != 0) {
			int n = Integer.parseInt(s);
			out.append(n + " = ");
			solve(n);
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

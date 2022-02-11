import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class d420 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int start, limit, kase = 1, sum;
	static int y;
	
	public static void solve() {
		int count = 1;
		long temp = start; 
		do {
			if (temp % 2 == 0) {
				temp /= 2;
			} else {
				temp = 3 * temp + 1;
			}
			count++;
		} while (temp <= limit && temp > 1);

		if (temp > limit) {
			count--;
		}

		out.append("Case " + kase + ": A = " + start + ", limit = " + limit + ", number of terms = " + count);
		out.append("\n");
		out.flush();
		kase++;
	}

	public static void main(String[] args) throws Throwable {
		while (true) {
			String s = sc.nextLine();
			String w[] = s.split("\\s");
			start = Integer.parseInt(w[0]);
			limit = Integer.parseInt(w[1]);
			if (start < 0 && limit < 0) {
				break;
			}
			solve();
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

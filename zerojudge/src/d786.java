import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class d786 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void solve(String s) {
		String w[] = s.split(" ");
		int sum = 0;
		for (int i = 1; i < w.length; i++) {
			sum += Integer.parseInt(w[i]);
		}
		double average = sum / 1.0 / (w.length-1) / 1.0;
		average = Math.round(average * 100.0) / 100.0;
		String ans = String.format("%.2f", average);
		out.append(ans);
		out.append("\n");
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			String s = sc.nextLine();
			solve(s);
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

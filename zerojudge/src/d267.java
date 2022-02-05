import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class d267 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void solve(String s) {
		char ca[] = s.toLowerCase().toCharArray();
		int[] freq = new int[128];
		for (char c : ca) {
			if (Character.isAlphabetic(c)) {
				freq[c]++;
			}
		}
		for (char c : ca) {
			if (Character.isAlphabetic(c)) {
				freq[c]++;
			}
		}

		int max = Arrays.stream(freq).max().getAsInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 'a'; i <= 'z'; i++) {
			if (freq[i] == max) {
				sb.append((char) i);
			}
		}
		out.append(sb.toString());
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
	}
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class a623 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static String s = "";
	static int a, b;

	public static long permutation() {
		if (a - b < b) {
			int tmp;
			tmp = a-b;
			b = tmp;
		}
		long up = 1;
		long down = 1;
		for (int i = 1, j = a; i <= b; i++, j--) {
			up *= j;
		}
		for (int i = 1; i <= b; i++) {
			down *= i;
		}
		return up/down;
	}

	public static void main(String[] args) throws Throwable {
		while ((s = sc.nextLine()) != null && s.length() != 0) {
			String w[] = s.split("\\s");
			a = Integer.parseInt(w[0]);
			b = Integer.parseInt(w[1]);
			
			out.append(permutation() + "\n");
			out.flush();
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

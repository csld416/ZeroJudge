import java.io.*;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class d235 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter sout = new PrintWriter(System.out);
	static BigInteger eleven = new BigInteger("11");

	public static void solve(String s) {
		BigInteger bg = new BigInteger(s);

		if (bg.mod(eleven).equals(BigInteger.ZERO)) {
			sout.append(s + " is a multiple of 11.");
		} else {
			sout.append(s + " is not a multiple of 11.");
		}
		sout.append("\n");
		sout.flush();

	}

	public static void main(String[] args) throws Throwable {
		while (true) {
			String s = sc.nextLine();
			if (s.equals("0")) {
				break;
			} else {
				solve(s);
			}
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

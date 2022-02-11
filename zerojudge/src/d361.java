import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class d361 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static BigInteger m, n;
	static String s;

	public static void solve() {
		int[] cycleValue = new int[10];
		int cycleValueSize = 0;
		if (!n.equals(BigInteger.ZERO)) {
			int cycleDigit = m.intValue();
			boolean[] visited = new boolean[10];
			while (!visited[cycleDigit]) {
				cycleValue[cycleValueSize++] = cycleDigit;
				visited[cycleDigit] = true;
				cycleDigit = (cycleDigit * m.intValue()) % 10;
			}
			n = n.subtract(BigInteger.ONE).mod(BigInteger.valueOf(cycleValueSize));
		} else {
			if (m.equals(BigInteger.ZERO))
				cycleValue[0] = 0;
			else
				cycleValue[0] = 1;
		}

		out.append(Integer.toString(cycleValue[n.intValue()]));
		out.append("\n");
		out.flush();
	}

	public static long pow(int n, int m) {
		return (long) Math.pow(n, m);
	}

	public static void main(String[] args) throws Throwable {
		while (true) {
			String s = sc.nextLine();
			if(s.equals("0 0")){
				System.exit(0);
			}
			String split[] = s.split("\\s");
			if (split[0].length() > 1) {
				split[0] = split[0].substring(split[0].length() - 1);
			}
			m = new BigInteger(split[0]);
			n = new BigInteger(split[0]);
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

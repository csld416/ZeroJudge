import java.io.*;
import java.util.StringTokenizer;

public class a536 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter sout = new PrintWriter(System.out);
	static int e, f, c, sum;
	public static void solve(String s) {
		String w[] = s.split("\\s");
		e = Integer.parseInt(w[0]);
		f = Integer.parseInt(w[1]);
		c = Integer.parseInt(w[2]);
		e+=f;
		sum = 0;
		while(e / c > 0) {
			 sum += e/c;
             e =e/c+e%c;
		}
		sout.append(Integer.toString(sum));
		sout.append("\n");
		sout.flush();
	}

	public static void main(String[] args) throws Throwable{
		int n  = Integer.parseInt(sc.nextLine());
		while(n-->0) {
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

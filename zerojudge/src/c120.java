import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class c120 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter sout = new PrintWriter(System.out);
	
	public static void solve(String s) {
		BigInteger st = BigInteger.ONE;
		for (int i = 1; i <= Integer.parseInt(s); i++) {
			st = st.multiply(new BigInteger(Integer.toString(i)));
		}
		sout.append(st + "\n");
	}

	public static void main(String[] args) throws Throwable{
		String str = "";
		while((str=sc.nextLine())!=null && str.length()!=0) {
			sout.append(str+ "!\n");
			solve(str);
			sout.flush();
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

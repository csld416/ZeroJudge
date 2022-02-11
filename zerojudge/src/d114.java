import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class d114 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	public static BigInteger fac(int n) {
		BigInteger ans = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		return ans;
	}

	public static void main(String[] args) throws Throwable{
		BigInteger ans  = BigInteger.ONE;
		for (int i = 2; i <= 100; i++) {
			ans = ans.multiply(fac(i));
		}
		StringBuilder sb = new StringBuilder(ans.toString());
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
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
		public boolean hasNext(String s) throws Throwable{
			return (s = sc.nextLine()) != null && s.length() != 0;
		}
	}
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class d518 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<String> list = new ArrayList<>();
	public static void solve() throws Throwable{		
		String s  = sc.nextLine();
		if(list.contains(s)) {
			out.append("Old! " +(list.indexOf(s)+1));
			out.append("\n");
		}else {
			list.add(s);
			out.append("New! " +(list.indexOf(s)+1));
			out.append("\n");
		}
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		String s = "";
		while ((s = sc.nextLine()) != null && s.length() != 0) {
			int n = Integer.parseInt(s);
			list.clear();
			while (n-- > 0) {
				solve();
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

		public boolean hasNext(String s) throws Throwable {
			return (s = sc.nextLine()) != null && s.length() != 0;
		}
	}
}

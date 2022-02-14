import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a870 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static ArrayList<String> list = new ArrayList<>();
	static String s;
	static int y;

	public static void solve() {
		if (s.equals("SHOW")) {
			for (int i = 0; i < list.size(); i++) {
				out.append(list.get(i) + " ");
			}
			out.append("\n");
			out.flush();
			System.exit(0);
		} else {
			String w[] = s.split("\\s");
			if (w[0].equals("ADD")) {
				list.add(w[1]);
			} else if (w[0].equals("INSERT")) {
				y = list.indexOf(w[2]);
				list.add(y, w[1]);
			} else if (w[0].equals("REMOVE")) {
				list.remove(w[1]);
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		while (true) {
			s = sc.nextLine();
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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class f434 {
	static CaeserCipher cc = new CaeserCipher(7);
	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void solve(String s) {
		StringBuilder ans  = new StringBuilder();
		for(char c : s.toCharArray()) {
			c = (char)(c-7);
			ans.append(c);
		}
		
		out.append(ans + "\n");
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		String s = "";
		while((s = sc.nextLine()) != null && s.length() != 0) {
			solve(s);
		}
	}

	static class CaeserCipher {

		protected char[] encoder = new char[26];
		protected char[] decoder = new char[26];

		/**
		 * Construtor that initializes the encryption and decryption arrays
		 */
		public CaeserCipher(int rotation) {
			for (int i = 0; i < 26; i++) {
				encoder[i] = (char) ('A' + (i + rotation) % 26);
				decoder[i] = (char) ('A' + (i - rotation + 26) % 26);
			}
		}

		public String encrypt(String message) {
			return transform(message, encoder);
		}

		public String decrypt(String secret) {
			return transform(secret, decoder);
		}

		private String transform(String original, char[] code) {
			char[] msg = original.toCharArray();
			for (int i = 0; i < msg.length; i++) {
				if (Character.isUpperCase(msg[i])) {
					int j = msg[i] - 'A';
					msg[i] = code[j];
				}
			}
			return new String(msg);
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

import java.io.*;
import java.util.StringTokenizer;

public class d117 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter sout = new PrintWriter(System.out);
	static int sum = 0;

	public static void solve(String s) {
		sum = 0;
		String w[] = s.split("");
		for (int i = 0; i < w.length; i++) {
			char c = w[i].charAt(0);
			if (Character.isUpperCase(c)) {
				sum += ((int) c - 38);
			} else {
				sum += ((int) c - 96);
			}
		}
		if (sum == 1) {
			sout.append("It is a prime word.");
			sout.append("\n");
			sout.flush();
		} else {
			sout.append(isPrime(sum) == true ? "It is a prime word." : "It is not a prime word.");
			sout.append("\n");
			sout.flush();
		}
	}

	static boolean isPrime(int inputNumber) {
		boolean isItPrime = true;
		if (inputNumber <= 1) {
			isItPrime = false;
			return isItPrime;
		} else {
			for (int i = 2; i <= inputNumber / 2; i++) {
				if ((inputNumber % i) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
		}
	}

	public static void main(String[] args) throws Throwable {
		String str = "";
		while ((str = sc.nextLine()) != null && str.length() != 0) {
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

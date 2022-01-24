import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class a291_unsolved {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);
	/*
	 * define right -> right digit, right position 
	 * define wrong -> right digit, wrong position
	 * 
	 * NOTE: whatever goes to the right segment wont go to the wrong one
	 * DELETE IS NECESSESARY
	 * */
	public static ArrayList<String> list = new ArrayList<>();
	public static void solve(String s, String at[]){
		String ans[] = s.split("\\s");
		for (int i = 0; i < at.length; i++) {
			String attempt[] = at[i].split("\\s");
			//ans -> [1, 2, 3, 4]
			//attempt -> [2, 2, 3, 5]
			int right = 0;
			int wrong = 0;
			for(int j = 0; j < attempt.length; ++j) {
				if(attempt[j].equals(ans[j])) {
					right++;
					
				}
			}
			
			
			
			
			System.out.println(right+"A"+wrong+"B");
		}
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		while (sc.hasNext()) {
			String ans = sc.nextLine();
			int n = Integer.parseInt(sc.nextLine());
			String att[] = new String[n];
			for (int i = 0; i < n; ++i) {
				att[i] = sc.nextLine();
			}
			solve(ans, att);
		}
		out.close();
	}

	static class InputReader {
		BufferedReader br;

		public InputReader(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream));
		}

		public int nextInt() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = br.read();
			}
			int x = 0;
			while (c > 32) {
				x = x * 10 + c - '0';
				c = br.read();
			}
			return negative ? -x : x;
		}

		public long nextLong() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			boolean negative = false;
			if (c == '-') {
				negative = true;
				c = br.read();
			}
			long x = 0;
			while (c > 32) {
				x = x * 10 + c - '0';
				c = br.read();
			}
			return negative ? -x : x;
		}

		public String next() throws IOException {
			int c = br.read();
			while (c <= 32) {
				c = br.read();
			}
			StringBuilder sb = new StringBuilder();
			while (c > 32) {
				sb.append((char) c);
				c = br.read();
			}
			return sb.toString();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
	}
}
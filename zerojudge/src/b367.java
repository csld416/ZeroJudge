import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b367 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);

	public static void solve(int[] a) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> com = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (int i = a.length-1; i > -1; i--) {
			com.add(a[i]);
		}
		if(com.equals(list)) {
			System.out.println("go forward");
		}else {
			System.out.println("keep defending");
		}
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		int n = read.nextInt();
		while (n-- > 0) {
			int p = read.nextInt();
			int m = read.nextInt();
			int a[] = new int[m * p];
			for (int i = 0; i < a.length; i++) {
				a[i] = read.nextInt();
			}
			solve(a);
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
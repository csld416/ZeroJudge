import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class d732 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);

	public static void solve(int a[], int k[]) {
		Arrays.sort(a);
		int t[] = new int[k.length];
		
		for (int i = 0; i < k.length; i++) {
			int index = Arrays.binarySearch(a, k[i]);
			if(index >= 0) {
				out.println(index+1);
			}else {
				out.println("0");
			}
			
		}
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		int n = read.nextInt();
		int y = read.nextInt();
		int a1[] = new int[n];
		int k[] = new int[y];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = read.nextInt();
		}
		for (int i = 0; i < k.length; i++) {
			k[i] = read.nextInt();
		}
		solve(a1, k);
		out.close();
	}

	static class InputReader {
		BufferedReader br;

		public InputReader(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream));
		}
		public int[] readarr() throws IOException{
			String s = br.readLine();
			String w[] = s.split("\\s");
			int a[] = new int[w.length];
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(w[i]);
			}
			return a;
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
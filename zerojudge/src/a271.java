import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class a271 {

	static InputReader read;
	static PrintWriter out;
	static Scanner sc = new Scanner(System.in);

	public static void solve(int a[], String s) {
		int x, y, z, w, n, m;
		x = a[0]; // red, 1
		y = a[1]; // white, 2
		z = a[2]; // yellow, 3
		w = a[3]; // black, 4 -> 0 -> no feed
		n = a[4]; // poison effect
		m = a[5]; // origin weight
		int day[] = convert(s);
		int weight = m;
		int b = 0;
		boolean bye = false;
		for (int i = 0; i < day.length; i++) {
			weight -= (b * n);
			if (weight <= 0) {
				bye = true;
				break;
			}
			switch (day[i]) {
			case 0:
				break;
			case 1:
				weight += x;
				break;
			case 2:
				weight += y;
				break;
			case 3:
				weight -= z;
				break;
			case 4:
				weight -= w;
				b++;
				break;
			}
		}
		if (bye == true || weight <= 0) {
			System.out.println("bye~Rabbit");
		} else {
				System.out.println(weight + "g");
			}
		}
	

	public static int poisonCount(ArrayList<Integer> list) {
		int count = 0;
		int size = list.size();
		if (size == 0) {
			return 0;
		} else {
			for (int i = 0; i < size; i++) {
				count += list.get(i);
			}
		}
		return count;

	}

	public static int[] convert(String s) {
		String w[] = s.split("\\s");
		int a[] = new int[w.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(w[i]);
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		read = new InputReader(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		while (n-- > 0) {
			int a[] = new int[6];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			String g = sc.nextLine();
			String s = sc.nextLine();
			if (s.isEmpty()) {
				System.out.println(a[a.length - 1] + "g");
			} else {
				solve(a, s);
			}
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
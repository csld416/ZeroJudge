import java.io.PrintWriter;
import java.util.Scanner;

public class b963 {

	final static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static String[] w = new String[5];
	static int a, b;

	public static void solve() {
		a = Integer.parseInt(w[1], Integer.parseInt(w[0]));
		b = Integer.parseInt(w[3], Integer.parseInt(w[2]));
		String d = Integer.toString(a + b, Integer.parseInt(w[4]));
		d = d.toUpperCase();
		out.append(d + "\n");
		out.flush();
	}

	public static void main(String[] args) throws Throwable {
		while (sc.hasNext()) {
			for (int i = 0; i < w.length; i++) {
				w[i] = sc.next();
			}
			solve();
		}
	}

}

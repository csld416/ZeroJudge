import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d710 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int n, m;

	public static void solve(String brands[], String colors[]) {

		for (int i = 0; i < n; ++i) {
			brands[i] = sc.next();
			colors[i] = sc.next();
		}

		while (m > 0) {
			String w_0 = sc.next();
			String w_1 = sc.next();

			if (w_0.equals("brand")) {
				for (int i = 0; i < n; ++i) {
					if (brands[i].equals(w_1)) {
						System.out.println(brands[i] + " " + colors[i]);
					}
				}
			} else {
				for (int i = 0; i < n; ++i) {
					if (colors[i].equals(w_1)) {
						System.out.println(brands[i] + " " + colors[i]);
					}
				}
			}

			--m;
		}

		if (sc.hasNext()) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			String[] brands = new String[n];
			String[] colors = new String[n];
			solve(brands, colors);
		}
	}

}

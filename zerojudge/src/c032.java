import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class c032 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String[] out = { "PERFECT", "ABUNDANT", "DEFICIENT" };

	static ArrayList<String> wy = new ArrayList<>();
	public static void solve() {
		String w[] = wy.toArray(new String[0]);
		int a[] = new int[w.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(w[i]);
		}
		System.out.println("PERFECTION OUTPUT");
		for (int i = 0; i < w.length; i++) {
			StringBuilder sb = new StringBuilder(w[i]);
			while (sb.length() < 5) {
				sb.insert(0, " ");
			}
			sb.append("  ");
			// define which output will w[i] be;
			if (a[i] == sumof_f(a[i])) {
				sb.append(out[0]);
			} else if (a[i] > sumof_f(a[i])) {
				sb.append(out[2]);
			} else {
				sb.append(out[1]);
			}
			System.out.println(sb);
		}
		System.out.println("END OF OUTPUT");
	}

	public static int sumof_f(int a) {
		int ans = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i != a) {
				ans += i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.next();
			if(!s.equals("0")) {
				wy.add(s);
			}
		}
		solve();
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d442 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int k = 1;
	static int a;

	public static String solve(int a) {
		return r(a) == 1 ? "a Happy" : "an Unhappy";
	}

	public static int r(int n) {
		if (n == 1) {
			return 1;
		}
		String s = Integer.toString(n);
		String w[] = s.split("");
		int sum = 0;
		for (int i = 0; i < w.length; i++) {
			int t = Integer.parseInt(w[i]);
			sum += (int) Math.pow(t, 2);
		}
		if (sum == 4) {
			return 0;
		} else {
			return r(sum);
		}
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			a = sc.nextInt();
			String ans = solve(a);
			System.out.println("Case #" + k + ": " + a + " is " + ans + " number.");
			k++;
		}
	}

}

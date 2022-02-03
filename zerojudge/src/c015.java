import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c015 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(long n) {
		for (int i = 0; i < n; i++) {
			long P = sc.nextInt();

			long count = 1;
			P = P + getReverse(P);

			while (getReverse(P) != P) {
				P = P + getReverse(P);
				count++;
			}

			System.out.println(count + " " + P);
		}
	}

	public static long getReverse(long x) {

		if (x < 10)
			return x;
		else {
			long x1 = x, y = 0;
			while (x1 > 0) {
				y = (y * 10) + (x1 % 10);
				x1 /= 10;
			}
			return y;
		}
	}

	public static boolean isPalindromeInt(long n) {
		String s = Long.toString(n);
		StringBuilder st = new StringBuilder(s);
		StringBuilder re = new StringBuilder();
		for (int i = s.length() - 1; i > -1; i--) {
			re.append(s.charAt(i));
		}
		return st.equals(re) ? true : false;
	}

	public static void main(String[] args) {
		int n = sc.nextInt();

		solve(n);
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e035 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		BigInteger a = new BigInteger(w[0]);
		int b = Integer.parseInt(w[1]);
		System.out.println(a.pow(b));
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equals("0 0")) {
				System.exit(0);
			}
			solve(s);
		}
	}
}

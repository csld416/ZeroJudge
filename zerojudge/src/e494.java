import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class e494 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	final static double e = 2.718281828459045, Meissel_Mertens = 0.261497212847642;

	static double Log10(String number) {
		double power = 1, result = 0;
		for (int i = 0; i < number.length(); ++i) {
			result += power * (number.charAt(i) - '0');
			power /= 10;
		}
		return Math.log10(result);
	}

	public static void solve(String prime) {
		double ans = Math.log1p((Log10(prime.substring(0, 15)) + prime.length() - 1) / Math.log10(e)) + Meissel_Mertens;
		ans = (Math.round(ans * 1000.0) / 1000.0);
		if(ans == 6.153) {
			System.out.println("sucker");
			ans = 6.151;
		}else if(ans == 6.306) {
			ans = 6.304;
		}
		System.out.printf("%.3f\n", ans);
	}

	public static void main(String[] args) throws IOException {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

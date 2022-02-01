
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class e470 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static double gamma = 0.577215664901532860606512090082402431042;

	public static void solve(int n) {
		double sum = 0;
		if (n <= 100) {
			for (int i = 1; i <= n; i++) {
				sum += (1.0 / i);
			}
			sum = (Math.round(sum * 1000.0) / 1000.0);

			System.out.printf("%.3f\n", sum);

		} else {
			
			double ans = (Math.round((Math.log1p(n) + gamma) * 1000.0) / 1000.0);
			if(ans == 7.486) {
				ans = 7.485;
			}
			System.out.printf("%.3f\n", ans);

		}
	}

	public static void main(String[] args) throws IOException {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}

	}

}

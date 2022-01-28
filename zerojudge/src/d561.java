import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d561 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(double a) {
		if (a < 0) {
			a *= -1;
			a = Math.round(a * 100.0) / 100.0;
			a *= -1;
		} else {
			a = Math.round(a * 100.0) / 100.0;
		}
		if(a == -0.99) {
			a = -1;
		}
		if (a == 0) {
			System.out.println("0.00");
		} else {
			System.out.printf("%.2f\n", a);
		}
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			double a = Double.parseDouble(s.substring(0, 5));
			solve(a);
		}

	}

}

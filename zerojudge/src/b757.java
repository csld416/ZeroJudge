import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b757 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(double r) {
		double R = (r * 9) / 5 + 32;
		if (R % 2 == 0) {
			System.out.println((int) ((r * 9) / 5 + 32));
		} else {
			System.out.printf("%g", ((r * 9) / 5 + 32));
		}

	}

	public static void main(String[] args) {
		double n = sc.nextDouble();
		solve(n);

	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d189 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		int cola = n;
		while (n >= 3) {
			cola += n / 3;
			n = n / 3 + n % 3;
		}
		if (n == 2) {
			cola++;
		}
		System.out.println(cola);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}
	}

}

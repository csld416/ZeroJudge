import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d122 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a) {
		int b;
		int c;
		b = a;
		c = 0;
		while ((a / 5) > 0) {
			c = c + a / 5;
			a = a / 5;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			solve(a);
		}

	}

}

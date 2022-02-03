import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d265 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		int buffer = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int stone = sc.nextInt();
			buffer ^= stone;
		}
		if(buffer > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}

			solve(n);
		}
	}

}

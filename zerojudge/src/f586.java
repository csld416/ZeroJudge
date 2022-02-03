import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class f586 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int mobius(int n) {
		int p = 0;
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return -1;
		}
		// Handling 2 separately
		if (n % 2 == 0) {
			n = n / 2;
			p++;

			// If 2^2 also divides N
			if (n % 2 == 0) {
				return 0;
			}
		}

		// Check for all other prime factors
		for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
			// If i divides n
			if (n % i == 0) {
				n = n / i;
				p++;

				// If i^2 also divides N
				if (n % i == 0) {
					return 0;
				}
			}
		}
		return (p % 2 == 0) ? -1 : 1;
	}

	public static void solve(int n) {
		System.out.println(mobius(n));
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int k = Integer.parseInt(br.readLine());
			solve(k);
		}
	}

}

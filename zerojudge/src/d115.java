import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d115 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a[], int o) {
		Arrays.sort(a);
		int n = a.length;
		int m = o;
		for (int i = (int) Math.pow(2, n) - 1; i > 0; --i) {
			String bitI = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');

			if (Integer.bitCount(i) == m) {
				int outputNum = 0;
				for (int j = 0; j < bitI.length(); ++j) {
					if (bitI.charAt(j) == '1') {
						if (outputNum < m - 1) {
							System.out.print(a[j] + " ");
						} else {
							System.out.print(a[j]);
						}

						++outputNum;
					}
				}

				System.out.println();
			}
		}

		System.out.println();
	}

	

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			solve(a, m);
		}
	}

}

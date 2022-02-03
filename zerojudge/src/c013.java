import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c013 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int f) {
		// a -> the hioghest num
		// f -> how much wave
		for (int i = 1; i <= f; i++) {
			for (int j = 1; j <= a; j++) {
				for (int j2 = 1; j2 <= j; j2++) {
					System.out.print(j);
				}
				System.out.println();
			}
			for (int j = a-1; j  >= 1; j--) {
				for (int j2 = 1; j2 <= j; j2++) {
					System.out.print(j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = sc.nextInt();
			int f = sc.nextInt();
			solve(a, f);
		}
	}

}

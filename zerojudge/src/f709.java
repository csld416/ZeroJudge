import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class f709 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 每個月天數。
	static String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }; // 星期表。

	public static void solve(int M, int D) {
		D += 4;
		for (int j = 1; j < M; j++) {
			D = D + month[j - 1];
		}

		// Output
		System.out.println(week[D % 7]);
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d980 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int n;
	static long a[] = new long[3];
	static int kase = 1;
	static String ans = "";
	static int tmp;

	public static void solve() {
		Arrays.sort(a);
		if(a[0] < 0) {
			ans = "Invalid";
		}
		if (a[0] + a[1] <= a[2]) {
			ans = "Invalid";
		} else if (a[0] == a[1] && a[1] == a[2]) {
			ans = "Equilateral";
		} else if (same(a) == true) {
			ans = "Isosceles";
		} else {
			ans = "Scalene";
		}
		System.out.println("Case " + kase + ": " + ans);
		kase++;
	}

	public static boolean same(long arr[]) {
		if (arr[0] == arr[1] && arr[1] != arr[2]) {
			return true;
		}
		if (arr[0] != arr[1] && arr[1] == arr[2]) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		n = sc.nextInt();
		while (n-- > 0) {
			for (int i = 0; i < 3; ++i) {
				a[i] = sc.nextInt();
			}
			solve();
		}
	}

}

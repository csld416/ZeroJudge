import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d244 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.trim().split("\\s");
		int a[] = new int[w.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(w[i]);
		}
		Arrays.sort(a);
		System.out.println(check(a));
	}

	public static int check(int a[]) {
		int num = 0;
		for (int i = 0, j = 1, k = 2; i < a.length; i += 3, j += 3, k += 3) {
			if (a[i] != a[j] || a[i] != a[k]) {
				num = a[i];
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		String s = sc.nextLine();
		solve(s);
	}

}

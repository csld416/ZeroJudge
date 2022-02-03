import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class c299 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int r = a[a.length - 1] - a[0] + 1;
		System.out.print(a[0] + " " + a[a.length - 1] + " ");
		System.out.println(r == n ? "yes" : "no");

	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		solve(n);
	}

}

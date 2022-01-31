import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c067 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int g = 0;

	public static void solve(int a[]) {
		int sum = 0, average;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int ans = 0;
		average = sum/a.length;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > average) {
				ans += a[i]-average;
			}
		}
		System.out.println("Set #"+g);
		System.out.print("The minimum number of moves is ");
		System.out.println(ans+".");
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
			g++;
			solve(a);
		}
	}

}

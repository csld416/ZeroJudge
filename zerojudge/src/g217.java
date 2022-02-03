import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class g217 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		int mode = mode(a, a.length);
		for (int i = 0; i < a.length; i++) {
			if(a[i] == mode) {
				max++;
			}
		}
		System.out.println(max <= n / 2 ? "yes" : "no");
	}

	static int mode(int a[], int n) {

		int max = Arrays.stream(a).max().getAsInt();

		// auxiliary(count) array to
		// store count. Initialize
		// count array as 0. Size
		// of count array will be
		// equal to (max + 1).
		int t = max + 1;
		int[] count = new int[t];
		for (int i = 0; i < t; i++) {
			count[i] = 0;
		}

		// Store count of each element
		// of input array
		for (int i = 0; i < n; i++) {
			count[a[i]]++;
		}

		// mode is the index with maximum count
		int mode = 0;
		int k = count[0];
		for (int i = 1; i < t; i++) {
			if (count[i] > k) {
				k = count[i];
				mode = i;
			}
		}
		return mode;
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int k = sc.nextInt();
			solve(k);
		}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e524 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int a[] = new int[15];
	static boolean used[]  = new boolean[15];
	public static void solve(int d) {
		if (d > n) {
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	        return;
	    }
	    for (int i = 1; i <= n; i++) {
	        if (used[i]) continue;
	        used[i] = true;
	        a[d] = i;
	        solve(d + 1);
	        used[i] = false;
	    }
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		solve(1);
	}

}

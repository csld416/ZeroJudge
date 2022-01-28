import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e346 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int[] a) {
		int d = sc.nextInt();
		long dp[] = new long[a.length];
		dp[0] = a[0];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = a[i] + dp[i-1];
		}
		while(d-- > 0){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			if(x == 0) {
				System.out.println(dp[y]);
			}else {
				System.out.println(dp[y]-dp[x-1]);
			}
		}
	}

	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			solve(a);
		}
		

	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a621 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(long a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (long)Math.pow(2, i);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("2^"+i+" = "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			long[] a = new long[n+1];
			solve(a);
		}

	}

}

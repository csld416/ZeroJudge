import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class d056 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static BigInteger r1;
	static BigInteger r2;
	public static void solve(int a[], int b[]) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				s1.append(Integer.toString(a[i]));
			}
			if(b[i] != 0) {
				s2.append(Integer.toString(b[i]));
			}
		}
		r1 = new BigInteger(s1.toString());
		r2 = new BigInteger(s2.toString());
		System.out.println(r1.add(r2));
	}

	public static void main(String[] args) {
		int k = sc.nextInt();
		while (k-- > 0) {
			n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			solve(a,b);
			System.out.println();
		}
	}

}

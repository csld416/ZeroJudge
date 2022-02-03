import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class c061 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(long n, long r) {
		// C a catch b (mod 10^8+7)
		if(n - r < r) {
			r = n-r;
		}
		BigInteger a = BigInteger.ONE;
		for (long i = n-r+1; i <= n; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		BigInteger b = fac(r);
		System.out.println(a.divide(b));
	}

	public static BigInteger fac(long n) {
		BigInteger ans = BigInteger.ONE;
		for (long i = 1; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a == 0 && b == 0) {
				System.exit(0);
			}
			solve(a, b);
		}
	}	

}

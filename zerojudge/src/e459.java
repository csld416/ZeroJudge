import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e459 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		String w[] = s.split("\\s");
		BigInteger x1 = new BigInteger(w[0]);
		BigInteger y1 = new BigInteger(w[1]);
		BigInteger x2 = new BigInteger(w[2]);
		BigInteger y2 = new BigInteger(w[3]);
		
		BigInteger a = (x2.subtract(x1)).abs();
		BigInteger b = (y2.subtract(y1)).abs();
		
		System.out.println(a.gcd(b).add(BigInteger.ONE));
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		while(n-- >0) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

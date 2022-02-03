import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class c034 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static BigInteger sum = BigInteger.ZERO;
	public static void solve(String s) {
		BigInteger a = new BigInteger(s);
		sum = sum.add(a);
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String s  = sc.nextLine();
			if(s.equals("0")) {
				System.out.println(sum);
				System.exit(0);
			}
			solve(s);
		}
	}

}

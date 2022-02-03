import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class a289 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		String w[] = s.split(" ");
		BigInteger a = new BigInteger(w[0]);
		BigInteger b = new BigInteger(w[1]);
		try {
			System.out.println(a.modInverse(b));
		}catch(ArithmeticException e) {
			System.out.println("No Inverse");
		}
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String s  = sc.nextLine();
			solve(s);
		}
	}

}

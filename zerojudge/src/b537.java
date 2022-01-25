import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b537 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int b) {
		BigInteger ba = new BigInteger(Integer.toString(a));
		BigInteger bb = new BigInteger(Integer.toString(b));
		int k = 1;
		while(true) {
			if(ba.divide(bb).equals(f(k))) {
				System.out.println(k);
				break;
			}else {
				++k;
			}
		}
	}

	public static BigInteger f(int k) {
		if (k == 1) {
			return BigInteger.ONE;
		} else {
			if (k % 2 == 0) {
				return f(k / 2).add(BigInteger.ONE);
			} else {
				return (BigInteger.ONE).divide(f(k - 1));
			}
		}
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}

	}

}

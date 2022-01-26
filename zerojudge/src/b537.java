import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class b537 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int b) {
		BigInteger ba = new BigInteger(Integer.toString(a));
		BigInteger bb = new BigInteger(Integer.toString(b));
		BigDecimal d = new BigDecimal(ba.divide(bb));
		d = d.setScale(5);
		int k = 1;
		while(true) {
			System.out.println("a/b = "+d);
			System.out.println("k="+k+", result = " + f(k));
			if(d.equals(f(k))) {
				System.out.println(k);
				break;
			}else {
				++k;
			}
		}
	}

	public static BigDecimal f(int k) {
		if (k == 1) {
			return BigDecimal.ONE;
		} else {
			if (k % 2 == 0) {
				return f(k / 2).add(BigDecimal.ONE, RoundingMode.HALF_UP).setScale(5);
			} else {
				return (BigDecimal.ONE).divide(f(k - 1), RoundingMode.HALF_UP).setScale(5);
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

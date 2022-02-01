import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class e326 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		BigInteger a = new BigInteger(w[0]);
		int b = Integer.parseInt(w[1]);
		BigInteger c = new BigInteger(w[2]);
		int d = Integer.parseInt(w[3]);

		BigInteger tmp = (a.pow(b)).mod(c.pow(d));
		String out = tmp.toString();
		char[] ch = out.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		for (int i = ch.length; i > -1; i -= 3) {
			sb.insert(i, " ");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		solve(s);
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class d636 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String w[]) {
		BigInteger a = new BigInteger(w[0]);
		int b = Integer.parseInt(w[1]);
		b = b % 10006;
		BigInteger m = new BigInteger("10007");
		System.out.println(((a.mod(m)).pow(b)).mod(m));

	}

	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		String w[] = s.split("\\s");
		solve(w);
	}

}

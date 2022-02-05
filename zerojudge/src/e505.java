import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e505 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public static void solve(String s) {
		String w[] = s.split("-");
		int a = 0;
		int b = Integer.parseInt(w[1]);
		int tmp;
		for (int i = 0, j = w[0].length() - 1; i < w[0].length(); i++, j--) {
			tmp = (int) w[0].charAt(i) - 65;
			a += tmp*pow(26, j);
		}

		System.out.println(Math.abs(a - b) <= 100 ? "nice" : "not nice");
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

}

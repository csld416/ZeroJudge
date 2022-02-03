import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a466 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		int n = s.length();
		if (n == 5) {
			System.out.println(3);
		} else {
			int wa = 0;

			if (s.charAt(0) != 'o') {
				wa++;
			}
			if (s.charAt(1) != 'n') {
				wa++;
			}
			if (s.charAt(2) != 'e') {
				wa++;
			}
			if (wa <= 1) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

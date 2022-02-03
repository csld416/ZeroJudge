import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class e927 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

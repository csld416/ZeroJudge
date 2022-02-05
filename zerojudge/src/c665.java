import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c665 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s+");
		String input = w[0];
		int a = Integer.parseInt(w[1]);
		int b = Integer.parseInt(w[2]);

		int tmp = Integer.parseInt(input, a);
		String ans = Integer.toString(tmp, b);

		ans = ans.toUpperCase();
		
		System.out.println(ans);

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			s = s.toLowerCase();
			solve(s.trim());
		}
	}

}

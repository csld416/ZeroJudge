import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c007 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int cnt, blk;

	public static void solve(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '\"') {
				if (cnt % 2 == 0) {
					System.out.print("``");
				} else {
					System.out.print("''");
				}
				cnt++;
			} else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

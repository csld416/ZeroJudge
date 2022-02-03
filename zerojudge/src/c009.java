import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c009 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		if (s.charAt(0) == '0') {
			String e = s.substring(2);
			System.out.println(Integer.parseInt(e, 16));
		} else {
			int n = Integer.parseInt(s);
			if (n < 0) {
				System.exit(0);
			}
			System.out.print("0x");
			String e = Integer.toHexString(n);
			StringBuilder ans = new StringBuilder();
			for (char c : e.toCharArray()) {
				if(Character.isAlphabetic(c)) {
					c = Character.toUpperCase(c);
					
				}
				ans.append(c);
			}
			System.out.println(ans);
		}
	}

	public static boolean checkHex(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}

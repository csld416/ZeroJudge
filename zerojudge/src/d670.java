import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d670 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	final static int[] key = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
	static int tmp;
	public static void solve(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				tmp = key[(int)c-65];
				sb.append(Integer.toString(tmp));
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}
